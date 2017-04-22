package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

// TODO please add annotation for entity class
@Entity
@Table(name="t_project")
public class ProjectId implements Serializable {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	// TODO implement this entity class
    private String projectName;
    private String role;

    public ProjectId() {

    }

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
