package com.daokoujinke.common.customEnum;

public enum RuleTypeEnum implements IntEnum<RuleTypeEnum> {
    DECISION_SET(1,"决策集"),DECISION_TABLE(2,"决策表"),DECISION_TREE(3,"决策树"),
    SCORECARD(4,"评分卡"),DECISION_FLOW(5,"决策流");

    private int code;
    private String description;

    private RuleTypeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static String fromIndex(int index) {
        for (RuleTypeEnum p : RuleTypeEnum.values()) {
            if (index == p.getCode())
                return p.description;
        }
        return null;
    }

    @Override
    public Integer getIntValue() {
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
