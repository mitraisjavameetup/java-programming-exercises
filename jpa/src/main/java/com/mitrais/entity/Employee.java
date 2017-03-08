package com.mitrais.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
public class Employee {
	// TODO implement this entity class

	private Long id;
	private String name;
	private Date dateOfBirth;
	private String gender;
	private String maritalStatus;
	private String phone;
	private String email;
	private Date hireDate;

	public Employee() {

	}

	public Long getId() {
		return this.id;
	}
	
	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	public String toString() {
		return String.format(
			"Employee object: [id: %d, name: '%s'",
			1, this.name
		);
	}

	public Employee setDateOfBirth(Date dob) {
		this.dateOfBirth = dob;
		return this;
	}

	public Employee setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public Employee setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
		return this;
	}

	public Employee setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public Employee setEmail(String email) {
		this.email = email;
		return this;
	}
}