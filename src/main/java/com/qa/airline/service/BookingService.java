package com.qa.airline.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.airline.dtos.BookingDto;
import com.qa.airline.persistence.domain.Booking;
import com.qa.airline.persistence.repo.BookingRepo;

@Service
public class BookingService {

	private BookingRepo repo;
	private ModelMapper mapper;
	
	
	public BookingService(BookingRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	public BookingDto mapToDto(Booking booking) {
		return this.mapper.map(booking, BookingDto.class);
	}
	
	public BookingDto create(Booking booking) {
		Booking bookingCreated = this.repo.save(booking);
		return this.mapToDto(bookingCreated);
	}
	
	public List<BookingDto> read() {
		List<BookingDto> dtos = new ArrayList<>();
		for(Booking booking : this.repo.findAll()) {
			dtos.add(this.mapToDto(booking));
		}
		return dtos;
	}
	
	
}
