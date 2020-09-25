package com.qa.airline.persistence.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue 
	private long id;
	
	@Column(name = "dateOfBooking")
	@GeneratedValue
	private Date dateOfBooking;
	
	public long getId() {
		return id;
	}

	public void setId(long id, Date dateOfBooking) {
		this.id = id;
		this.dateOfBooking = dateOfBooking;
	}

	public Booking() {
		
	}
	
	
	

}
