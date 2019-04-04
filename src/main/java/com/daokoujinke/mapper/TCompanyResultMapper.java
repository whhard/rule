package com.daokoujinke.mapper;

import com.daokoujinke.entity.TCompanyResult;
import com.daokoujinke.entity.TCompanyResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCompanyResultMapper {
    long countByExample(TCompanyResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCompanyResult record);

    int insertSelective(TCompanyResult record);

    List<TCompanyResult> selectByExample(TCompanyResultExample example);

    TCompanyResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCompanyResult record, @Param("example") TCompanyResultExample example);

    int updateByExample(@Param("record") TCompanyResult record, @Param("example") TCompanyResultExample example);

    int updateByPrimaryKeySelective(TCompanyResult record);

    int updateByPrimaryKey(TCompanyResult record);
}