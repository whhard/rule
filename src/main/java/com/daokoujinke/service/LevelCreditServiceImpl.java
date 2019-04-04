package com.daokoujinke.service;

import com.bstek.urule.Utils;
import com.bstek.urule.model.rule.RuleInfo;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.response.RuleExecutionResponse;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.daokoujinke.common.customEnum.RuleTypeEnum;
import com.daokoujinke.config.datasource.DS;
import com.daokoujinke.entity.*;
import com.daokoujinke.entity.project.RuleLog;
import com.daokoujinke.mapper.TLevelCreditBaseMapper;
import com.daokoujinke.mapper.TResultCountBaseMapper;
import com.daokoujinke.mapper.TScoreLevelBaseMapper;
import com.daokoujinke.mapper.TScorecardBaseMapper;
import com.daokoujinke.mapper.project.ResultCountMapper;
import com.daokoujinke.mapper.project.RuleLogMapper;
import com.daokoujinke.mapper.project.ScoreCardMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
public class LevelCreditServiceImpl implements LevelCreditService {
    private static final Logger log = LoggerFactory.getLogger(LevelCreditServiceImpl.class);

    @Autowired
    private RuleLogMapper ruleLogMapper;
    @Autowired
    private ScoreCardMapper scoreCardMapper;
    @Autowired
    private ResultCountMapper resultCountMapper;
    @Autowired
    private TLevelCreditBaseMapper tLevelCreditBaseMapper;

    @Override
    @DS("datasource1")
    public TScorecardBase findScoreByName(String companyName) {
        TScorecardBase tScorecardBase = scoreCardMapper.queryByCompanyName(companyName);
        return tScorecardBase;
    }

    @Override
    @DS("datasource1")
    public TResultCountBase findResultCountByName(String companyName) {
        TResultCountBase tResultCountBase = resultCountMapper.queryByCompanyName(companyName);
        return tResultCountBase;
    }

    @Override
    @DS("datasource1")
    public void insertScoreLevel(TScorecardBase tScorecardBase, TResultCountBase tResultCountBase) {
        //项目名称和知识包id
        String projectNameAndId = "leili/bag3";
        try {
            //创建一个knowledgeSession对象
            KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
            KnowledgePackage knowledgePackage = knowledgeService.getKnowledge(projectNameAndId);
            KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
            //将业务对象插入到session中
            session.insert(tScorecardBase);
            session.insert(tResultCountBase);
            Map<String,Object> parameter = new HashMap<>();
            //触发规则时并设置参数
            parameter.put("level","");
            parameter.put("credit","");
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
            //获取等级、放款额度结果
            TLevelCreditBase levelCreditBase = new TLevelCreditBase();
            levelCreditBase.setCompanyName(tResultCountBase.getCompanyName());
            levelCreditBase.setPersonName(tResultCountBase.getPersonName());
            levelCreditBase.setIdNumber(tResultCountBase.getIdNumber());
            String level = (String) session.getParameter("level");
            levelCreditBase.setLevel(level);
            String credit = (String) session.getParameter("credit");
            levelCreditBase.setCredit(credit);
            levelCreditBase.setCreateTime(new java.sql.Timestamp(new Date().getTime()));
            log.info("等级、放款额度入库",levelCreditBase);
            tLevelCreditBaseMapper.insert(levelCreditBase);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
