package com.qa.airline.dtos;

import java.util.List;


import com.qa.airline.persistence.domain.Customer;
import com.qa.airline.persistence.domain.Flight;

import lombok.Getter;
import lombok.Setter;

public class BookingDto {

	@Getter 
	@Setter 
	private long id;
	

	@Getter 
	@Setter 
	private Customer fkCustomerId;
	
	@Getter 
	@Setter 
	private List<Flight> fkFlightId;
	
	public BookingDto() {
		
	}

	public BookingDto(long id, Customer fkCustomerId, List<Flight> fkFlightId) {
		super();
		this.id = id;
		this.fkCustomerId = fkCustomerId;
		this.fkFlightId = fkFlightId;
	}
	
	
}
