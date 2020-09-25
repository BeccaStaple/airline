package com.qa.airline.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.airline.dtos.FlightDto;
import com.qa.airline.persistence.domain.Flight;
import com.qa.airline.service.FlightService;


@RestController
@RequestMapping("/flight")
@CrossOrigin
public class FlightController {
	
	private FlightService service;

	public FlightController(FlightService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/makeFlight")
	public ResponseEntity<FlightDto> create(@RequestBody Flight flight) {
		return new ResponseEntity<FlightDto>(this.service.create(flight), HttpStatus.CREATED);
	}
	
	@GetMapping("/getFlights")
	public ResponseEntity<List<FlightDto>> read() {
		return new ResponseEntity<List<FlightDto>>(this.service.read(), HttpStatus.OK);
	}

}
