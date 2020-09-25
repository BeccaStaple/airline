package com.qa.airline.dtos;




public class BookingDto {

	private long id;

	
	public BookingDto() {
		
	}

	public BookingDto(long id) {
		super();
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
