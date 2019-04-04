package com.daokoujinke.mapper;

import com.daokoujinke.entity.CAuthCodeLogin;
import com.daokoujinke.entity.CAuthCodeLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CAuthCodeLoginMapper {
    long countByExample(CAuthCodeLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CAuthCodeLogin record);

    int insertSelective(CAuthCodeLogin record);

    List<CAuthCodeLogin> selectByExample(CAuthCodeLoginExample example);

    CAuthCodeLogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CAuthCodeLogin record, @Param("example") CAuthCodeLoginExample example);

    int updateByExample(@Param("record") CAuthCodeLogin record, @Param("example") CAuthCodeLoginExample example);

    int updateByPrimaryKeySelective(CAuthCodeLogin record);

    int updateByPrimaryKey(CAuthCodeLogin record);
}