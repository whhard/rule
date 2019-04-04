package com.daokoujinke.mapper;

import com.daokoujinke.entity.CRelationInfo;
import com.daokoujinke.entity.CRelationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CRelationInfoMapper {
    long countByExample(CRelationInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CRelationInfo record);

    int insertSelective(CRelationInfo record);

    List<CRelationInfo> selectByExample(CRelationInfoExample example);

    CRelationInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CRelationInfo record, @Param("example") CRelationInfoExample example);

    int updateByExample(@Param("record") CRelationInfo record, @Param("example") CRelationInfoExample example);

    int updateByPrimaryKeySelective(CRelationInfo record);

    int updateByPrimaryKey(CRelationInfo record);
}