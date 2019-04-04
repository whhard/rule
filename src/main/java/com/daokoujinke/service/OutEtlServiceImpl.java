package com.daokoujinke.service;

import com.bstek.urule.Utils;
import com.bstek.urule.model.rule.RuleInfo;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.response.RuleExecutionResponse;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.daokoujinke.common.customEnum.RuleTypeEnum;
import com.daokoujinke.common.exception.CustomException;
import com.daokoujinke.config.datasource.DS;
import com.daokoujinke.entity.OutEtlEnterprise;
import com.daokoujinke.entity.OutEtlEnterpriseExample;
import com.daokoujinke.entity.TScorecardBase;
import com.daokoujinke.entity.project.RuleLog;
import com.daokoujinke.mapper.OutEtlEnterpriseMapper;
import com.daokoujinke.mapper.TScorecardBaseMapper;
import com.daokoujinke.mapper.project.RuleLogMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
public class OutEtlServiceImpl implements OutEtlService {
    private static final Logger log = LoggerFactory.getLogger(OutEtlServiceImpl.class);

    @Autowired
    private RuleLogMapper ruleLogMapper;
    @Autowired
    private TScorecardBaseMapper tScorecardBaseMapper;
    @Autowired
    private OutEtlEnterpriseMapper outEtlEnterpriseMapper;

    @Override
    @DS("datasource1")
    public OutEtlEnterprise findByCompanyName(String companyName) {
        OutEtlEnterpriseExample example = new OutEtlEnterpriseExample();
        example.createCriteria().andCompanyNameEqualTo(companyName);
        List<OutEtlEnterprise> outEtlEnterprises = outEtlEnterpriseMapper.selectByExample(example);
        OutEtlEnterprise outEtlEnterprise = outEtlEnterprises.size() == 0 ? new OutEtlEnterprise() : outEtlEnterprises.get(0);
        return outEtlEnterprise;
    }

    @Override
    @DS("datasource1")
    public void insertResultMsg(OutEtlEnterprise outEtlEnterprise) {
        //项目名称和知识包id
        String projectNameAndId = "leili/bag2";
        try {
            //创建一个knowledgeSession对象
            KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
            KnowledgePackage knowledgePackage = knowledgeService.getKnowledge(projectNameAndId);
            KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
            //将业务对象插入到session中
            if (outEtlEnterprise.getRegcapital().equals("-")){
                outEtlEnterprise.setRegcapital("0");
            }
            if (outEtlEnterprise.getRegcapital().contains("万元人民币")){
                outEtlEnterprise.setRegcapital(outEtlEnterprise.getRegcapital().replaceAll("万元人民币","").trim());
            }
            if (outEtlEnterprise.getRegcapital().contains("万")){
                outEtlEnterprise.setRegcapital(outEtlEnterprise.getRegcapital().replaceAll("万","").trim());
            }
            session.insert(outEtlEnterprise);
            Map<String,Object> parameter = new HashMap<>();
            //触发规则时并设置参数
            parameter.put("score","");
            RuleExecutionResponse response = session.fireRules(parameter);
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
            List<TScorecardBase> list = new ArrayList<>();
            for (RuleInfo matchedRule : matchedRules) {
                TScorecardBase tScorecardBase = new TScorecardBase();
                tScorecardBase.setCompanyName(outEtlEnterprise.getCompanyName());
                //获取计算后score的值
                String score =(String) session.getParameter("score");
                System.out.println("我是score："+score);
                tScorecardBase.setScore(new Integer(score));
                tScorecardBase.setCreateTime(new java.sql.Timestamp(new Date().getTime()));
                list.add(tScorecardBase);
            }
            //添加规则结果
            for (TScorecardBase tScorecardBase : list) {
                tScorecardBaseMapper.insert(tScorecardBase);
            }
        } catch (IOException e) {
            throw new CustomException("获取评分卡分数失败");
        }
    }
}
