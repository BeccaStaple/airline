package com.qa.airline.persistence.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "flight")
public class Flight {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "timeOfDeparture")
	@NotNull
	private String timeOfDeparture;
	
	@Column(name = "dateOfDeparture")
	@NotNull
	private Date dateOfDeparture;
	
	@Column(name = "flyingFrom")
	@NotNull
	private String flyingFrom;
	
	@Column(name = "flyingTo")
	@NotNull
	private String flyingTo;
	
	@Column(name = "price")
	@NotNull
	private double price;
	
	public Flight() {
		
	}
	
	public Flight(String timeOfDeparture, Date dateOfDeparture, String flyingFrom, String flyingTo, double price) {
		super();
		this.timeOfDeparture = timeOfDeparture;
		this.dateOfDeparture = dateOfDeparture;
		this.flyingFrom = flyingFrom;
		this.flyingTo = flyingTo;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(String timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public String getFlyingFrom() {
		return flyingFrom;
	}

	public void setFlyingFrom(String flyingFrom) {
		this.flyingFrom = flyingFrom;
	}

	public String getFlyingTo() {
		return flyingTo;
	}

	public void setFlyingTo(String flyingTo) {
		this.flyingTo = flyingTo;
	}
	
	

}
