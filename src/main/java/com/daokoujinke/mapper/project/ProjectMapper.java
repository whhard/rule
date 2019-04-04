package com.daokoujinke.mapper.project;

import com.daokoujinke.entity.project.Project;

import java.util.List;

public interface ProjectMapper {
    public int addProject(Project project);

    public List<Project> qeuryProjectList();
}
