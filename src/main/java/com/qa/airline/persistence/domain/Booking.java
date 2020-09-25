package com.qa.airline.persistence.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue 
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Booking() {
		
	}
	
	
	

}
