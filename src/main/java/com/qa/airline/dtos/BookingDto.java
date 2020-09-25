package com.qa.airline.dtos;




import lombok.Getter;
import lombok.Setter;

public class BookingDto {

	@Getter 
	@Setter 
	private long id;
	

	
	

	
	public BookingDto() {
		
	}

	public BookingDto(long id) {
		super();
		this.id = id;
	}
	
	
}
