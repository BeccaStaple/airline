package com.qa.airline.persistence.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;


@Entity(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "firstName", length = 100)
	@NotNull
	private String firstName;
	
	@Column(name = "surName", length = 100)
	@NotNull
	private String surName;
	
	@Column(name = "email", length = 100)
	@NotNull
	private String email;

	
	public Customer() {
		
	}

	public Customer(String firstName, String surName, String email) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
