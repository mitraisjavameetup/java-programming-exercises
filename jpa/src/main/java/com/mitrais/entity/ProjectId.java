package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

// TODO please add annotation for entity class
@Embeddable
public class ProjectId implements Serializable {
    // TODO implement this entity class
	@Column(name="project_name")
    private String projectName;
	@Column(name="role")
    private String role;

    public ProjectId() {

    }

    public ProjectId(String projectName, String role) {
    	this.projectName = projectName;
    	this.role = role;
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
