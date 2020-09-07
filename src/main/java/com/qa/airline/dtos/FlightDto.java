package com.qa.airline.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class FlightDto {

	
	@Getter
	@Setter
	private long id;
	
	
	@Getter
	@Setter
	private String timeOfDeparture;
	
	@Getter
	@Setter
	private Date dateOfDeparture;
	
	
	@Getter
	@Setter
	private String flyingFrom;
	
		@Getter
	@Setter
	private String flyingTo;
	
	public FlightDto() {
		
	}

	public FlightDto(long id, String timeOfDeparture, Date dateOfDeparture, String flyingFrom, String flyingTo) {
		super();
		this.id = id;
		this.timeOfDeparture = timeOfDeparture;
		this.dateOfDeparture = dateOfDeparture;
		this.flyingFrom = flyingFrom;
		this.flyingTo = flyingTo;
	}
	
	
	
}
