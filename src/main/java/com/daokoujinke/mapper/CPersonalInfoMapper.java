package com.daokoujinke.mapper;

import com.daokoujinke.entity.CPersonalInfo;
import com.daokoujinke.entity.CPersonalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CPersonalInfoMapper {
    long countByExample(CPersonalInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CPersonalInfo record);

    int insertSelective(CPersonalInfo record);

    List<CPersonalInfo> selectByExample(CPersonalInfoExample example);

    CPersonalInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CPersonalInfo record, @Param("example") CPersonalInfoExample example);

    int updateByExample(@Param("record") CPersonalInfo record, @Param("example") CPersonalInfoExample example);

    int updateByPrimaryKeySelective(CPersonalInfo record);

    int updateByPrimaryKey(CPersonalInfo record);
}