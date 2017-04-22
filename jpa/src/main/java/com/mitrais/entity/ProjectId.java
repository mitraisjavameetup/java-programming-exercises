package com.mitrais.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;



// TODO please add annotation for entity class
@Embeddable
public class ProjectId implements Serializable {
    // TODO implement this entity class
    @Column(name="projectName")
	private String projectName;
    @Column(name="role")
    private String role;

    public ProjectId() {

    }

    public ProjectId(String projectName, String role) {
    	this.projectName=projectName;
    	this.role=role;
    }

	public String getProjectName() {
		return projectName;
	}

public String getRole() {
	return role;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public void setRole(String role) {
	this.role = role;
}
    
    
}
