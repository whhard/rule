package com.daokoujinke.vo.response;

import java.io.Serializable;

public class RuleLogResp implements Serializable {
    private Integer id;
    private String ruleName;
    private String ruleType;
    private String projectName;
    private Integer runTime;
    private Integer successTime;
    private Integer failTime;
    private Integer hitTime;
    private Integer totalCount;

    @Override
    public String toString() {
        return "RuleLogResp{" +
                "id=" + id +
                ", ruleName='" + ruleName + '\'' +
                ", ruleType='" + ruleType + '\'' +
                ", projectName='" + projectName + '\'' +
                ", runTime=" + runTime +
                ", successTime=" + successTime +
                ", failTime=" + failTime +
                ", hitTime=" + hitTime +
                ", totalCount=" + totalCount +
                '}';
    }

    public RuleLogResp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public Integer getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Integer successTime) {
        this.successTime = successTime;
    }

    public Integer getFailTime() {
        return failTime;
    }

    public void setFailTime(Integer failTime) {
        this.failTime = failTime;
    }

    public Integer getHitTime() {
        return hitTime;
    }

    public void setHitTime(Integer hitTime) {
        this.hitTime = hitTime;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
