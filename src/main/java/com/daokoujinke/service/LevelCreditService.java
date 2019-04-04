package com.daokoujinke.service;

import com.daokoujinke.entity.TResultCountBase;
import com.daokoujinke.entity.TScorecardBase;

public interface LevelCreditService {
    //根据参数公司名称获取评分卡业务对象
    public TScorecardBase findScoreByName(String companyName);
    //根据参数公司名称获取规则结果对象
    public TResultCountBase findResultCountByName(String companyName);
    //获取等级、放款额度入库
    public void insertScoreLevel(TScorecardBase tScorecardBase,TResultCountBase tResultCountBase);
}
