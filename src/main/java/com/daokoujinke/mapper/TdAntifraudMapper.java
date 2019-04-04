package com.daokoujinke.mapper;

import com.daokoujinke.entity.TdAntifraud;
import com.daokoujinke.entity.TdAntifraudExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdAntifraudMapper {
    long countByExample(TdAntifraudExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TdAntifraud record);

    int insertSelective(TdAntifraud record);

    List<TdAntifraud> selectByExampleWithBLOBs(TdAntifraudExample example);

    List<TdAntifraud> selectByExample(TdAntifraudExample example);

    TdAntifraud selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TdAntifraud record, @Param("example") TdAntifraudExample example);

    int updateByExampleWithBLOBs(@Param("record") TdAntifraud record, @Param("example") TdAntifraudExample example);

    int updateByExample(@Param("record") TdAntifraud record, @Param("example") TdAntifraudExample example);

    int updateByPrimaryKeySelective(TdAntifraud record);

    int updateByPrimaryKeyWithBLOBs(TdAntifraud record);

    int updateByPrimaryKey(TdAntifraud record);
}