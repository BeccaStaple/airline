package com.qa.airline.dtos;

import java.util.Date;

public class BookingDto {

	private long id;
	
	private Date dateOfBooking;

	
	public BookingDto() {
		
	}

	public BookingDto(long id, Date dateOfBooking) {
		super();
		this.id = id;
		this.dateOfBooking = dateOfBooking;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	
}
