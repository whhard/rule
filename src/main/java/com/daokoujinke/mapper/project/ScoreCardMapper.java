package com.daokoujinke.mapper.project;

import com.daokoujinke.entity.TScorecardBase;

public interface ScoreCardMapper {
    //根据公司名称获取最新一条记录
    public TScorecardBase queryByCompanyName(String companyName);
}
