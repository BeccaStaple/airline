package com.qa.airline.dtos;


public class CustomerDto {
	
	
	private long id;
	
	
	private String firstName;
	
	
	private String surName;
	
	
	
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
