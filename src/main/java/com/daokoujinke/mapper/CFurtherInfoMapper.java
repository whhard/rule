package com.daokoujinke.mapper;

import com.daokoujinke.entity.CFurtherInfo;
import com.daokoujinke.entity.CFurtherInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CFurtherInfoMapper {
    long countByExample(CFurtherInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CFurtherInfo record);

    int insertSelective(CFurtherInfo record);

    List<CFurtherInfo> selectByExample(CFurtherInfoExample example);

    CFurtherInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CFurtherInfo record, @Param("example") CFurtherInfoExample example);

    int updateByExample(@Param("record") CFurtherInfo record, @Param("example") CFurtherInfoExample example);

    int updateByPrimaryKeySelective(CFurtherInfo record);

    int updateByPrimaryKey(CFurtherInfo record);
}