package com.daokoujinke.mapper;

import com.daokoujinke.entity.UserFiles;
import com.daokoujinke.entity.UserFilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFilesMapper {
    long countByExample(UserFilesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFiles record);

    int insertSelective(UserFiles record);

    List<UserFiles> selectByExampleWithBLOBs(UserFilesExample example);

    List<UserFiles> selectByExample(UserFilesExample example);

    UserFiles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFiles record, @Param("example") UserFilesExample example);

    int updateByExampleWithBLOBs(@Param("record") UserFiles record, @Param("example") UserFilesExample example);

    int updateByExample(@Param("record") UserFiles record, @Param("example") UserFilesExample example);

    int updateByPrimaryKeySelective(UserFiles record);

    int updateByPrimaryKeyWithBLOBs(UserFiles record);

    int updateByPrimaryKey(UserFiles record);
}