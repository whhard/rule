package com.daokoujinke.service;

import com.daokoujinke.entity.OutEtlEnterprise;

public interface OutEtlService {
    //根据参数公司名称获取公司相关信息
    public OutEtlEnterprise findByCompanyName(String companyName);
    //将公司匹配的规则及结果入库
    public void insertResultMsg(OutEtlEnterprise outEtlEnterprise);
}
