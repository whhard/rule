package com.daokoujinke.mapper.project;

import com.daokoujinke.entity.project.RuleLog;
import com.daokoujinke.vo.response.RuleLogResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RuleLogMapper {
    //规则日志的录入
    public int addRuleLog(RuleLog ruleLog);
    //获取所有规则运行的日志
    public List<RuleLogResp> queryAllLog(@Param("projectName")String projectName, @Param("ruleType")String ruleType, @Param("begin")Integer begin, @Param("rows")Integer rows, @Param("startTime")String startTime, @Param("endTime")String endTime, @Param("ruleName")String ruleName);
    //获取所有的项目库
    public List<String> queryAllProjectName();
    //根据规则名称获取该规则信息
    public RuleLog getRuleLogByRuleName(String ruleName);
    //更新规则日志记录次数
    public void updateRuleLog(RuleLog ruleLog);
}
