package com.qa.airline.dtos;

import java.sql.Time;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class FlightDto {

	
	@Getter
	@Setter
	private long id;
	
	
	@Getter
	@Setter
	private Time timeOfDeparture;
	
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

	public FlightDto(long id, Time timeOfDeparture, Date dateOfDeparture, String flyingFrom, String flyingTo) {
		super();
		this.id = id;
		this.timeOfDeparture = timeOfDeparture;
		this.dateOfDeparture = dateOfDeparture;
		this.flyingFrom = flyingFrom;
		this.flyingTo = flyingTo;
	}
	
	
	
}
