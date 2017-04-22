package com.mitrais.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_branch_office")
public class BranchOffice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	@Column(name = "phone")
	private String phone;
	@Column(name = "postal_code")
	private String postalCode;
	// TODO add annotation when necessary
	@OneToMany
	private List<Employee> employees;

	public BranchOffice() {}

	public Long getId() {
		return id;
	}

	public BranchOffice setId(Long id) {
		this.id = id;
		return this;
	}

	public String getCity() {
		return city;
	}

	public BranchOffice setCity(String city) {
		this.city = city;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public BranchOffice setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public BranchOffice setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public BranchOffice setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
}