package com.qa.airline.dtos;

import lombok.Getter;
import lombok.Setter;

public class CustomerDto {
	
	@Getter 
	@Setter 
	private long id;
	
	
	@Getter 
	@Setter 
	private String firstName;
	
	
	@Getter 
	@Setter 
	private String surName;
	
	
	@Getter 
	@Setter 
	private String email;
	
	public CustomerDto() {
		
	}

	public CustomerDto(long id, String firstName, String surName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
	}
	
	

}
