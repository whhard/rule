package com.daokoujinke.mapper.project;

import com.daokoujinke.entity.TResultCountBase;

public interface ResultCountMapper {
    //返回最新一条数据统计记录
    public TResultCountBase queryByCompanyName(String companyName);
}
