package com.daokoujinke.mapper.project;

public interface CompanyResultMapper {
    //根据规则结果类型统计最近一批规则纪律数量
    public int countResultCountByType(String resultType);
    //根据公司名称统计触发的所有规则
    public int countAllType();
}
