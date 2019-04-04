package com.daokoujinke.entity.project;

import com.daokoujinke.common.customEnum.RuleTypeEnum;

import java.io.Serializable;
import java.sql.Timestamp;

public class RuleLog implements Serializable {
    private Integer id;
    private String ruleName;
    private RuleTypeEnum ruleType;
    private String projectName;
    private Integer runTime;
    private Integer successTime;
    private Integer failTime;
    private Integer hitTime;
    private Integer totalCount;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Override
    public String toString() {
        return "RuleLog{" +
                "id=" + id +
                ", ruleName='" + ruleName + '\'' +
                ", ruleType=" + ruleType +
                ", projectName='" + projectName + '\'' +
                ", runTime=" + runTime +
                ", successTime=" + successTime +
                ", failTime=" + failTime +
                ", hitTime=" + hitTime +
                ", totalCount=" + totalCount +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
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

    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public RuleLog() {
    }
}
