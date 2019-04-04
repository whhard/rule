package com.daokoujinke.mapper;

import com.daokoujinke.entity.TLevelCreditBase;
import com.daokoujinke.entity.TLevelCreditBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLevelCreditBaseMapper {
    long countByExample(TLevelCreditBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLevelCreditBase record);

    int insertSelective(TLevelCreditBase record);

    List<TLevelCreditBase> selectByExample(TLevelCreditBaseExample example);

    TLevelCreditBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLevelCreditBase record, @Param("example") TLevelCreditBaseExample example);

    int updateByExample(@Param("record") TLevelCreditBase record, @Param("example") TLevelCreditBaseExample example);

    int updateByPrimaryKeySelective(TLevelCreditBase record);

    int updateByPrimaryKey(TLevelCreditBase record);
}