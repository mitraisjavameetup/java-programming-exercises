package com.mitrais.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *  InternalProject entity is project to develop 
 *  in-house software/ solution
 **/
@Entity
@Table(name = "t_internal_project")
public class InternalProject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "project_name")
	private String projectName;
	@Column(name = "product_name")
	private String productName;
	// TODO @ManyToMany association with Employee entity
	@ManyToMany(targetEntity = Employee.class)
	private List<Employee> employees;

	public InternalProject() {}

	public Long getId() {
		return id;
	}

	public InternalProject setId(Long id) {
		this.id = id;
		return this;
	}

	public Date getStartDate() {
		return startDate;
	}

	public InternalProject setStartDate(Date startDate) {
		this.startDate = startDate;
		return this;
	}

	public Date getEndDate() {
		return endDate;
	}

	public InternalProject setEndDate(Date endDate) {
		this.endDate = endDate;
		return this;
	}

	public String getProjectName() {
		return projectName;
	}

	public InternalProject setProjectName(String projectName) {
		this.projectName = projectName;
		return this;
	}

	public String getProductName() {
		return productName;
	}

	public InternalProject setProductName(String productName) {
		this.productName = productName;
		return this;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public InternalProject setEmployees(List<Employee> employees) {
		this.employees = employees;
		return this;
	}
}