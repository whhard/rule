package com.daokoujinke.mapper;

import com.daokoujinke.entity.CEnterpriseInfo;
import com.daokoujinke.entity.CEnterpriseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CEnterpriseInfoMapper {
    long countByExample(CEnterpriseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CEnterpriseInfo record);

    int insertSelective(CEnterpriseInfo record);

    List<CEnterpriseInfo> selectByExample(CEnterpriseInfoExample example);

    CEnterpriseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CEnterpriseInfo record, @Param("example") CEnterpriseInfoExample example);

    int updateByExample(@Param("record") CEnterpriseInfo record, @Param("example") CEnterpriseInfoExample example);

    int updateByPrimaryKeySelective(CEnterpriseInfo record);

    int updateByPrimaryKey(CEnterpriseInfo record);
}