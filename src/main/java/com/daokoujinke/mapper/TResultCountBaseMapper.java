package com.daokoujinke.mapper;

import com.daokoujinke.entity.TResultCountBase;
import com.daokoujinke.entity.TResultCountBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TResultCountBaseMapper {
    long countByExample(TResultCountBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TResultCountBase record);

    int insertSelective(TResultCountBase record);

    List<TResultCountBase> selectByExample(TResultCountBaseExample example);

    TResultCountBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TResultCountBase record, @Param("example") TResultCountBaseExample example);

    int updateByExample(@Param("record") TResultCountBase record, @Param("example") TResultCountBaseExample example);

    int updateByPrimaryKeySelective(TResultCountBase record);

    int updateByPrimaryKey(TResultCountBase record);
}