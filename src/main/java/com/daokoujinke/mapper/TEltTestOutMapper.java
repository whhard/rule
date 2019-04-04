package com.daokoujinke.mapper;

import com.daokoujinke.entity.TEltTestOut;
import com.daokoujinke.entity.TEltTestOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEltTestOutMapper {
    long countByExample(TEltTestOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TEltTestOut record);

    int insertSelective(TEltTestOut record);

    List<TEltTestOut> selectByExample(TEltTestOutExample example);

    TEltTestOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TEltTestOut record, @Param("example") TEltTestOutExample example);

    int updateByExample(@Param("record") TEltTestOut record, @Param("example") TEltTestOutExample example);

    int updateByPrimaryKeySelective(TEltTestOut record);

    int updateByPrimaryKey(TEltTestOut record);
}