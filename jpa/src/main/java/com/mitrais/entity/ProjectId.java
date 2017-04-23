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
@Table(name = "t_projectid")
public class ProjectId implements Serializable {
    // TODO implement this entity class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "project_name")
    private String projectName;

	@Column(name = "role")
    private String role;

    public ProjectId() {

    }

    public ProjectId(String projectName, String role) {
    	this.projectName = projectName;
    	this.role = role;
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
