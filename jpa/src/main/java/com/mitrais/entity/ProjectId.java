package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
@Embeddable
// TODO please add annotation for entity class
public class ProjectId implements Serializable {
    // TODO implement this entity class
	@Column(name = "projectName")
    private String projectName;
	@Column(name = "role")
    private String role;

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

	public ProjectId() {

    }

    public ProjectId(String projectName, String role) {
    	this.projectName = projectName;
    	this.role = role;
    }
}
