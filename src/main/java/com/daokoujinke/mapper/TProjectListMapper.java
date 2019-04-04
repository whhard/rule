package com.daokoujinke.mapper;

import com.daokoujinke.entity.TProjectList;
import com.daokoujinke.entity.TProjectListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectListMapper {
    long countByExample(TProjectListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProjectList record);

    int insertSelective(TProjectList record);

    List<TProjectList> selectByExample(TProjectListExample example);

    TProjectList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProjectList record, @Param("example") TProjectListExample example);

    int updateByExample(@Param("record") TProjectList record, @Param("example") TProjectListExample example);

    int updateByPrimaryKeySelective(TProjectList record);

    int updateByPrimaryKey(TProjectList record);
}