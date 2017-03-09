package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProjectId implements Serializable {

    @Column(name = "project_name")
    private String projectName;
    @Column(name = "role")
    private String role;

    public ProjectId() {

    }

    public ProjectId(String projectName, String role) {
        this.setProjectName(projectName);
        this.setRole(role);
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
