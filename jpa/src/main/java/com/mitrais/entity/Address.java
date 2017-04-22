package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_address_id")
	private Long id;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "postal_code")
	private String postalCode;
	// TODO add Employee entity when needed
	// private Employee employee;

	public Address() {}

	public Long getId() {
		return id;
	}

	public Address setId(Long id) {
		this.id = id;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Address setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public Address setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}
}