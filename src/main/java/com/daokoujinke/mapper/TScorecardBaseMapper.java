package com.daokoujinke.mapper;

import com.daokoujinke.entity.TScorecardBase;
import com.daokoujinke.entity.TScorecardBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TScorecardBaseMapper {
    long countByExample(TScorecardBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TScorecardBase record);

    int insertSelective(TScorecardBase record);

    List<TScorecardBase> selectByExample(TScorecardBaseExample example);

    TScorecardBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TScorecardBase record, @Param("example") TScorecardBaseExample example);

    int updateByExample(@Param("record") TScorecardBase record, @Param("example") TScorecardBaseExample example);

    int updateByPrimaryKeySelective(TScorecardBase record);

    int updateByPrimaryKey(TScorecardBase record);
}