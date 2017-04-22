package com.mitrais.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *   Employee is entity mapped to table
 *	 t_employee with columns:
 *	 <ol>
 *		<li>id integer primary key auto generated</li>
 *		<li>name string</li>
 *		<li>date_of_birth date</li>
 *		<li>gender string</li>
 *		<li>marital_status string</li>
 *		<li>phone string</li>
 *		<li>email string</li>
 *		<li>hire_date date</li>
 *	 </ol>
 *   each column should have setter/getter. The setter/getter
 *   method should not contain any underscore.
 *	 e.g.: getHireDate() and setHireDate(date)
 * 	 all setters method should return object itself, or this.
 **/
// TODO please add annotation for entity class

// TODO please add static query for Employee.filterByLocation and Employee.filterByEmploymentHistory (with JOIN)

// TODO please add annotation to set Entity Listener

@Entity
@Table(name="t_employee")
@NamedQueries({
    @NamedQuery(name="Employee.filterByLocation",
                query="SELECT e FROM Employee e Where e.officeLocation = :location"),
    @NamedQuery(name="Employee.filterByEmploymentHistory",
                query="SELECT e FROM Employee e JOIN e.EmploymentHistory h on e.id = h.empId WHERE h.id.projectName = :projectName")
}) 
@EntityListeners(EmployeeEntityListener.class)
public class Employee {
	// TODO implement this entity class
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	@Column(name="gender")
	private String gender;
	@Column(name="marital_status")
	private String maritalStatus;
	@Column(name="phone")
	private String phone;
	@Column(name="email")
	private String email;
	@Column(name="hired_date")
	private Date hireDate;
	@Column(name="office_location")
	private String officeLocation;
	@Column(name="last_modified")
	private Date lastModified;
	@Embedded
	private Period period;
	// TODO @OneToOne association/relationship with Address entity
	//      association is optional, cascading all operations
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	// TODO @OneToMany association with GradeHistory entity
	//   	cascading all operations, and remove orphan
	// 		join column must no be null
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="employee_id",referencedColumnName="id")
	private List<GradeHistory> grades;
	// TODO @ManyToOne association with BranchOffice entity
	@ManyToOne(optional=true)
	@JoinColumn(name="office_id")
	private BranchOffice branchOffice;
	// TODO @ManyToMany association with InternalProject entity
	@ManyToMany(targetEntity=InternalProject.class)
	private List<InternalProject> projects;

	public Employee() {
		this.grades = new ArrayList<GradeHistory>();
		this.projects = new ArrayList<InternalProject>();
		this.branchOffice = new BranchOffice();
	}
	
	public Long getId() {
		return this.id;
	}

	public Employee setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	public String toString() {
		return String.format(
			"Employee object: [id: %d, name: '%s'",
			this.id, this.name
		);
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public Employee setDateOfBirth(Date dob) {
		this.dateOfBirth = dob;
		return this;
	}

	public String getGender() {
		return this.gender;
	}

	public Employee setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public Employee setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
		return this;
	}

	public String getPhone() {
		return this.phone;
	}

	public Employee setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getEmail() {
		return this.email;
	}

	public Employee setEmail(String email) {
		this.email = email;
		return this;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

	public Employee setHireDate(Date hireDate) {
		this.hireDate = hireDate;
		return this;
	}


	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Address getAddress() {
		return address;
	}

	public Employee setAddress(Address address) {
		this.address = address;
		return this;
	}

	public List<GradeHistory> getGrades() {
		return this.grades;
	}

	public Employee setGrades(List<GradeHistory> grades) {
		this.grades = grades;
		return this;
	}

	public List<InternalProject> getProjects() {
		return this.projects;
	}

	public Employee setProjects(List<InternalProject> projects) {
		this.projects = projects;
		return this;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public BranchOffice getBranchOffice() {
		return branchOffice;
	}

	public Employee setBranchOffice(BranchOffice branchOffice) {
		this.branchOffice = branchOffice;
		return this;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
}