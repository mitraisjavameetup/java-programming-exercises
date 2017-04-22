package com.mitrais.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

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
@Entity
@Table (name = "t_employee")
// TODO please add static query for Employee.filterByLocation and Employee.filterByEmploymentHistory (with JOIN)
@NamedQueries({
		@NamedQuery(name="filterByLocation",
				query= "SELECT e FROM Employee e JOIN e.branchOffice o WHERE o.city = :location"),
		@NamedQuery(name="filterByEmploymentHistory",
				query= "SELECT e FROM Employee e JOIN e.projects p WHERE p.id = :projectId")
})
// TODO please add annotation to set Entity Listener
@EntityListeners(EmployeeEntityListener.class)
public class Employee {
	// TODO implement this entity class
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	private String gender;
	@Column(name = "MARITAL_STATUS")
	private String maritalStatus;
	private String phone;
	private String email;
	@Column(name = "HIRE_DATE")
	private Date hireDate;
	@Column(name = "OFFICE_ID")
	private String officeLocation;
	private Date lastModified;
	private Period period;
	// TODO @OneToOne association/relationship with Address entity
	//      association is optional, cascading all operations
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	// TODO @OneToMany association with GradeHistory entity
	//   	cascading all operations, and remove orphan
	// 		join column must no be null
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = GradeHistory.class, mappedBy = "employeeId")
	private List<GradeHistory> grades;
	// TODO @ManyToOne association with BranchOffice entity
	@ManyToOne(cascade = CascadeType.ALL)
	private BranchOffice branchOffice;
	// TODO @ManyToMany association with InternalProject entity
	@ManyToMany(targetEntity = InternalProject.class)
	@JoinTable(name = "t_employee_project", joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id")
			, inverseJoinColumns = @JoinColumn(name = "internal_project_id", referencedColumnName = "id"))
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