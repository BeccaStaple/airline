package com.qa.airline.persistence.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "flight")
public class Flight {
	
	@Id
	@GeneratedValue
	@Getter
	@Setter
	private long id;
	
	@Column
	@NotNull
	@Getter
	@Setter
	private String timeOfDeparture;
	
	@Column
	@NotNull
	@Getter
	@Setter
	private String dateOfDeparture;
	
	@Column
	@NotNull
	@Getter
	@Setter
	private String flyingFrom;
	
	@Column
	@NotNull
	@Getter
	@Setter
	private String flyingTo;
	

	
	public Flight() {
		
	}
	
	public Flight(String timeOfDeparture, String dateOfDeparture, String flyingFrom, String flyingTo) {
		super();
		this.timeOfDeparture = timeOfDeparture;
		this.dateOfDeparture = dateOfDeparture;
		this.flyingFrom = flyingFrom;
		this.flyingTo = flyingTo;
	}
	
	

}
