package com.daokoujinke.mapper;

import com.daokoujinke.entity.OutEtlEnterprise;
import com.daokoujinke.entity.OutEtlEnterpriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutEtlEnterpriseMapper {
    long countByExample(OutEtlEnterpriseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OutEtlEnterprise record);

    int insertSelective(OutEtlEnterprise record);

    List<OutEtlEnterprise> selectByExample(OutEtlEnterpriseExample example);

    OutEtlEnterprise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OutEtlEnterprise record, @Param("example") OutEtlEnterpriseExample example);

    int updateByExample(@Param("record") OutEtlEnterprise record, @Param("example") OutEtlEnterpriseExample example);

    int updateByPrimaryKeySelective(OutEtlEnterprise record);

    int updateByPrimaryKey(OutEtlEnterprise record);
}