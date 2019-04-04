package com.daokoujinke.mapper;

import com.daokoujinke.entity.OutEtlEnterpriseCopy;
import com.daokoujinke.entity.OutEtlEnterpriseCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutEtlEnterpriseCopyMapper {
    long countByExample(OutEtlEnterpriseCopyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OutEtlEnterpriseCopy record);

    int insertSelective(OutEtlEnterpriseCopy record);

    List<OutEtlEnterpriseCopy> selectByExample(OutEtlEnterpriseCopyExample example);

    OutEtlEnterpriseCopy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OutEtlEnterpriseCopy record, @Param("example") OutEtlEnterpriseCopyExample example);

    int updateByExample(@Param("record") OutEtlEnterpriseCopy record, @Param("example") OutEtlEnterpriseCopyExample example);

    int updateByPrimaryKeySelective(OutEtlEnterpriseCopy record);

    int updateByPrimaryKey(OutEtlEnterpriseCopy record);
}