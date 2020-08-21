package com.qa.airline.persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Getter 
	@Setter 
	private long id;
	
	@Column
	@NotNull
	@Getter 
	@Setter 
	private String firstName;
	
	@Column
	@NotNull
	@Getter 
	@Setter 
	private String surName;
	
	@Column
	@NotNull
	@Getter 
	@Setter 
	private String email;
	
	@OneToMany(mappedBy = "customer")
	private List<Booking> booking;
	
	
	
	public Customer() {
		
	}

	public Customer(String firstName, String surName, String email) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
	}

	
	
}
