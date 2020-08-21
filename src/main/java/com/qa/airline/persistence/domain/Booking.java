package com.qa.airline.persistence.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue
	@Getter 
	@Setter 
	private long id;
	
	@ManyToOne(targetEntity = Customer.class)
	private Customer customer;
	
	@OneToMany(mappedBy = "booking")
	private List<Flight> flight;
	
	
	public Booking() {
		
	}

	public Booking(Customer customer, List<Flight> flight) {
		this.customer = customer;
		this.flight = flight;
	}
	
	
	

}
