package com.daokoujinke.mapper;

import com.daokoujinke.entity.TScoreLevelBase;
import com.daokoujinke.entity.TScoreLevelBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TScoreLevelBaseMapper {
    long countByExample(TScoreLevelBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TScoreLevelBase record);

    int insertSelective(TScoreLevelBase record);

    List<TScoreLevelBase> selectByExample(TScoreLevelBaseExample example);

    TScoreLevelBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TScoreLevelBase record, @Param("example") TScoreLevelBaseExample example);

    int updateByExample(@Param("record") TScoreLevelBase record, @Param("example") TScoreLevelBaseExample example);

    int updateByPrimaryKeySelective(TScoreLevelBase record);

    int updateByPrimaryKey(TScoreLevelBase record);
}