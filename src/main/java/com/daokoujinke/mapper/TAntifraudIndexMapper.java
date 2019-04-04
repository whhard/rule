package com.daokoujinke.mapper;

import com.daokoujinke.entity.TAntifraudIndex;
import com.daokoujinke.entity.TAntifraudIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAntifraudIndexMapper {
    long countByExample(TAntifraudIndexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAntifraudIndex record);

    int insertSelective(TAntifraudIndex record);

    List<TAntifraudIndex> selectByExample(TAntifraudIndexExample example);

    TAntifraudIndex selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAntifraudIndex record, @Param("example") TAntifraudIndexExample example);

    int updateByExample(@Param("record") TAntifraudIndex record, @Param("example") TAntifraudIndexExample example);

    int updateByPrimaryKeySelective(TAntifraudIndex record);

    int updateByPrimaryKey(TAntifraudIndex record);
}