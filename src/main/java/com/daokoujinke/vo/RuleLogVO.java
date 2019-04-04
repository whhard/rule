package com.daokoujinke.vo;

import java.io.Serializable;

public class RuleLogVO implements Serializable {
    private String ruleName;
    private String ruleType;
    private String projectName;
    private String date;
    private Integer pageNo;
    private Integer pageSize;

    @Override
    public String toString() {
        return "RuleLogVO{" +
                "ruleName='" + ruleName + '\'' +
                ", ruleType='" + ruleType + '\'' +
                ", projectName='" + projectName + '\'' +
                ", date='" + date + '\'' +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
