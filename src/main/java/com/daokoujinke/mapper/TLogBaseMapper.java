package com.daokoujinke.mapper;

import com.daokoujinke.entity.TLogBase;
import com.daokoujinke.entity.TLogBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogBaseMapper {
    long countByExample(TLogBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLogBase record);

    int insertSelective(TLogBase record);

    List<TLogBase> selectByExample(TLogBaseExample example);

    TLogBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLogBase record, @Param("example") TLogBaseExample example);

    int updateByExample(@Param("record") TLogBase record, @Param("example") TLogBaseExample example);

    int updateByPrimaryKeySelective(TLogBase record);

    int updateByPrimaryKey(TLogBase record);
}