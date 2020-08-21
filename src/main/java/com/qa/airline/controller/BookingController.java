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

import com.qa.airline.dtos.BookingDto;
import com.qa.airline.persistence.domain.Booking;
import com.qa.airline.service.BookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {
	
	private BookingService service;

	public BookingController(BookingService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/makeBooking")
	public ResponseEntity<BookingDto> create(@RequestBody Booking booking) {
		return new ResponseEntity<BookingDto>(this.service.create(booking), HttpStatus.CREATED);
	}
	
	@GetMapping("/returnBooking")
	public ResponseEntity<List<BookingDto>> read() {
		return new ResponseEntity<List<BookingDto>>(this.service.read(), HttpStatus.OK);
	}

}
