package com.qa.airline.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.airline.dtos.CustomerDto;
import com.qa.airline.persistence.domain.Customer;
import com.qa.airline.service.CustomerService;

@RestController
@Controller
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

	private CustomerService service;

	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/makeCustomer")
	public ResponseEntity<CustomerDto> create(@RequestBody Customer customer) {
		return new ResponseEntity<CustomerDto>(this.service.create(customer), HttpStatus.CREATED);
	}
	
	@GetMapping("/returnCustomer")
	public ResponseEntity<List<CustomerDto>> read() {
		return new ResponseEntity<List<CustomerDto>>(this.service.read(), HttpStatus.OK);
	}
}
