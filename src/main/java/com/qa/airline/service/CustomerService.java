package com.qa.airline.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.airline.dtos.CustomerDto;
import com.qa.airline.persistence.domain.Customer;
import com.qa.airline.persistence.repo.CustomerRepo;

@Service
public class CustomerService {
	
	private CustomerRepo repo;
	private ModelMapper mapper;
	
	public CustomerService(CustomerRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	public CustomerDto mapToDto(Customer customer) {
		return this.mapper.map(customer, CustomerDto.class);
	}
	
	public CustomerDto create(Customer customer) {
		Customer customerCreated = this.repo.save(customer);
		return this.mapToDto(customerCreated);
	}
	
	public List<CustomerDto> read() {
		List<CustomerDto> dtos = new ArrayList<>();
		for(Customer customer : this.repo.findAll()) {
			dtos.add(this.mapToDto(customer));
		}
		return dtos;
	}

}
