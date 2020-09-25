package com.qa.airline.persistence.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue
	@Getter 
	@Setter 
	private long id;
	
	public Booking() {
		
	}
	
	
	

}
