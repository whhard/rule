package com.daokoujinke.service.project;

import com.daokoujinke.common.exception.CustomException;
import com.daokoujinke.config.datasource.DS;
import com.daokoujinke.entity.project.Project;
import com.daokoujinke.mapper.project.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    @DS("datasource1")
    public List<Project> showAllProject() {
        try {
            List<Project> projects = projectMapper.qeuryProjectList();
            int i = 1;
            for (Project project : projects) {
                project.setId(i);
                i++;
            }
            return projects;
        } catch (Exception e) {
            throw new CustomException("暂无项目规则列表数据");
        }
    }
}
