package com.daokoujinke.service;

import com.bstek.urule.Utils;
import com.bstek.urule.action.ActionValue;
import com.bstek.urule.model.rule.RuleInfo;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.response.RuleExecutionResponse;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.daokoujinke.common.customEnum.RuleTypeEnum;
import com.daokoujinke.common.exception.CustomException;
import com.daokoujinke.config.datasource.DS;
import com.daokoujinke.entity.*;
import com.daokoujinke.entity.project.RuleLog;
import com.daokoujinke.mapper.*;
import com.daokoujinke.mapper.project.CompanyResultMapper;
import com.daokoujinke.mapper.project.RuleLogMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;

@Service
public class AntifraudIndexServiceImpl implements AntifraudIndexService {
    private static final Logger log = LoggerFactory.getLogger(AntifraudIndexServiceImpl.class);

    @Autowired
    private RuleLogMapper ruleLogMapper;
    @Autowired
    private TCompanyResultMapper tCompanyResultMapper;
    @Autowired
    private TAntifraudIndexMapper tAntifraudIndexMapper;
    @Autowired
    private TResultCountBaseMapper tResultCountBaseMapper;
    @Autowired
    private CompanyResultMapper companyResultMapper;

    @Override
    @DS("datasource1")
    public TAntifraudIndex findTAntifraudIndexByName(String companyName) {
        TAntifraudIndexExample example = new TAntifraudIndexExample();
        example.createCriteria().andCustNameEqualTo(companyName);
        List<TAntifraudIndex> tAntifraudIndices = tAntifraudIndexMapper.selectByExample(example);
        TAntifraudIndex tAntifraudIndex = tAntifraudIndices.size() == 0 ? new TAntifraudIndex() : tAntifraudIndices.get(0);
        return tAntifraudIndex;
    }

    @Override
    @DS("datasource1")
    public void insertResultMsg(TAntifraudIndex tAntifraudIndex,OutEtlEnterprise outEtlEnterprise){
        //项目名称和知识包id
        String projectNameAndId = "leili/bag";
        try {
            //创建一个knowledgeSession对象
            KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
            KnowledgePackage knowledgePackage = knowledgeService.getKnowledge(projectNameAndId);
            KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
            //将业务对象插入到session中
            System.out.println("规则触发前信用分："+tAntifraudIndex.getFinalScoreLeader());
            session.insert(tAntifraudIndex);
            session.insert(outEtlEnterprise);
            //TResultCountBase tResultCountBase1 = new TResultCountBase();
           // session.insert(tResultCountBase1);
            Map<String,Object> parameter = new HashMap<>();
            //触发规则时并设置参数
            Map<String,String> resultMap= new HashMap<>();
            parameter.put("resultMap",resultMap);
            RuleExecutionResponse response = session.fireRules(parameter);
            //System.out.println("pass:"+tResultCountBase1.getPass()+",refuse:"+tResultCountBase1.getRefuse());
            System.out.println("规则触发后信用分："+tAntifraudIndex.getFinalScoreLeader());
            //匹配到的规则
            List<RuleInfo> matchedRules = response.getMatchedRules();
            //规则日志
            List<RuleLog> ruleLogs = new ArrayList<>();
            for (RuleInfo rule : matchedRules) {
                RuleLog ruleLog = new RuleLog();
                //规则名称
                String ruleName = rule.getName();
                if (ruleName.contains("else")) {
                    ruleName = ruleName.replace("else", "");
                }
                RuleLog ruleLog1 = ruleLogMapper.getRuleLogByRuleName(ruleName);
                if (ruleLog1 == null){
                    //第一次运行规则
                    //规则库名称
                    ruleLog.setProjectName(projectNameAndId.split("/")[0]);
                    //规则名称
                    ruleLog.setRuleName(ruleName);
                    //规则类型
                    if (ruleName.contains("规则")) {
                        ruleLog.setRuleType(RuleTypeEnum.DECISION_SET);
                    }
                    if (ruleName.contains("评分卡")) {
                        ruleLog.setRuleType(RuleTypeEnum.SCORECARD);
                    }
                    if (ruleName.contains("决策树")) {
                        ruleLog.setRuleType(RuleTypeEnum.DECISION_TREE);
                    }
                    ruleLog.setCreateTime(new java.sql.Timestamp(new Date().getTime()));
                    //规则运行次数
                    ruleLog.setRunTime(1);
                    //成功次数
                    ruleLog.setSuccessTime(1);
                    //命中次数
                    if (!rule.getName().contains("else")) {
                        ruleLog.setHitTime(1);
                    }else {
                        ruleLog.setHitTime(0);
                    }
                    ruleLogs.add(ruleLog);
                }else {
                    //规则日志已存在，更新相关次数记录
                    ruleLog1.setRunTime(ruleLog1.getRunTime()+1);
                    ruleLog1.setSuccessTime(ruleLog1.getSuccessTime()+1);
                    if (!rule.getName().contains("else")){
                        ruleLog1.setHitTime(ruleLog1.getHitTime()+1);
                    }
                    log.info("更新规则日志");
                    ruleLogMapper.updateRuleLog(ruleLog1);
                }
            }
            //添加规则日志
            if (!ruleLogs.isEmpty()){
                for (RuleLog log : ruleLogs) {
                    ruleLogMapper.addRuleLog(log);
                }
            }
            //存储规则结果
            List<TCompanyResult> list = new ArrayList<>();
            Timestamp timestamp = new Timestamp(new Date().getTime());
            for (RuleInfo rule : matchedRules) {
                TCompanyResult result = new TCompanyResult();
                result.setCompanyName(tAntifraudIndex.getCustName());
                result.setPersonName(tAntifraudIndex.getName());
                result.setIdNumber(tAntifraudIndex.getIdcode());
                String ruleName = null;
                if (rule.getName().contains("else")) {
                    ruleName = rule.getName().replace("else", "");
                } else {
                    ruleName = rule.getName();
                }
                result.setRuleName(ruleName);
                //获取计算后的result的值
                Map result1 = (Map) session.getParameter("resultMap");
                String res = (String) result1.get(ruleName);
                result.setResult(res);
                result.setCreateTime(timestamp);
                list.add(result);
            }
            //添加规则结果
            for (TCompanyResult result : list) {
                tCompanyResultMapper.insert(result);
            }
            log.info("规则结果入库完成，开始统计规则结果");
            //统计规则结果
            TResultCountBase tResultCountBase = new TResultCountBase();
            tResultCountBase.setCompanyName(tAntifraudIndex.getCustName());
            tResultCountBase.setPersonName(tAntifraudIndex.getName());
            tResultCountBase.setIdNumber(tAntifraudIndex.getIdcode());
            int totalCount = companyResultMapper.countAllType();
            tResultCountBase.setTotalcount(totalCount);
            int pass = companyResultMapper.countResultCountByType("通过");
            tResultCountBase.setPass(pass);
            int bad = companyResultMapper.countResultCountByType("不良");
            tResultCountBase.setBad(bad);
            int risk = companyResultMapper.countResultCountByType("风险");
            tResultCountBase.setRisk(risk);
            int audit = companyResultMapper.countResultCountByType("审核");
            tResultCountBase.setAudit(audit);
            int refuse = companyResultMapper.countResultCountByType("拒绝");
            tResultCountBase.setRefuse(refuse);
            tResultCountBase.setCreateTime(new java.sql.Timestamp(new Date().getTime()));
            log.info("规则结果统计入库");
            tResultCountBaseMapper.insert(tResultCountBase);
        } catch (Exception e) {
            throw new CustomException("获取决策集结果失败");
        }
    }
}
