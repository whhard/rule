package com.daokoujinke.mapper;

import com.daokoujinke.entity.TUserLogin;
import com.daokoujinke.entity.TUserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserLoginMapper {
    long countByExample(TUserLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserLogin record);

    int insertSelective(TUserLogin record);

    List<TUserLogin> selectByExample(TUserLoginExample example);

    TUserLogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserLogin record, @Param("example") TUserLoginExample example);

    int updateByExample(@Param("record") TUserLogin record, @Param("example") TUserLoginExample example);

    int updateByPrimaryKeySelective(TUserLogin record);

    int updateByPrimaryKey(TUserLogin record);
}