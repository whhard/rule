package com.daokoujinke.service;

import com.daokoujinke.entity.OutEtlEnterprise;
import com.daokoujinke.entity.TAntifraudIndex;

public interface AntifraudIndexService {
    //根据参数公司名称获取公司相关信息
    public TAntifraudIndex findTAntifraudIndexByName(String companyName);
    //将公司匹配的规则及结果入库
    public void insertResultMsg(TAntifraudIndex tAntifraudIndex, OutEtlEnterprise outEtlEnterprise);
}
