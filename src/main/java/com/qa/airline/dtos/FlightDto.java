package com.qa.airline.dtos;

import java.util.Date;


public class FlightDto {
	
	private long id;
	
	private String timeOfDeparture;
	
	private Date dateOfDeparture;
	
	private String flyingFrom;
	
	private String flyingTo;
	
	private double price;
	
	public FlightDto() {
		
	}

	public FlightDto(long id, String timeOfDeparture, Date dateOfDeparture, String flyingFrom, String flyingTo, double price) {
		super();
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
	
}
