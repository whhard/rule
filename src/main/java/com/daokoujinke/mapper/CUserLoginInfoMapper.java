package com.daokoujinke.mapper;

import com.daokoujinke.entity.CUserLoginInfo;
import com.daokoujinke.entity.CUserLoginInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CUserLoginInfoMapper {
    long countByExample(CUserLoginInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CUserLoginInfo record);

    int insertSelective(CUserLoginInfo record);

    List<CUserLoginInfo> selectByExample(CUserLoginInfoExample example);

    CUserLoginInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CUserLoginInfo record, @Param("example") CUserLoginInfoExample example);

    int updateByExample(@Param("record") CUserLoginInfo record, @Param("example") CUserLoginInfoExample example);

    int updateByPrimaryKeySelective(CUserLoginInfo record);

    int updateByPrimaryKey(CUserLoginInfo record);
}