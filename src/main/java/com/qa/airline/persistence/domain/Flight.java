package com.qa.airline.persistence.domain;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private Time timeOfDeparture;
	
	@Column
	@NotNull
	@Getter
	@Setter
	private Date dateOfDeparture;
	
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
	
	@ManyToOne(targetEntity = Booking.class)
	private Booking booking;
	
	public Flight() {
		
	}
	
	public Flight(Time timeOfDeparture, Date dateOfDeparture, String flyingFrom, String flyingTo) {
		super();
		this.timeOfDeparture = timeOfDeparture;
		this.dateOfDeparture = dateOfDeparture;
		this.flyingFrom = flyingFrom;
		this.flyingTo = flyingTo;
	}
	
	

}
