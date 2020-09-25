package com.qa.airline.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.airline.dtos.FlightDto;
import com.qa.airline.persistence.domain.Flight;
import com.qa.airline.persistence.repo.FlightRepo;

@Service
public class FlightService {
	
	private FlightRepo repo;
	private ModelMapper mapper;
	
	public FlightService(FlightRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	public FlightDto mapToDto(Flight flight) {
		return this.mapper.map(flight, FlightDto.class);
	}
	
	public FlightDto create(Flight flight) {
		Flight flightCreated = this.repo.save(flight);
		return this.mapToDto(flightCreated);
	}
	
	public List<FlightDto> read() {
		List<FlightDto> dtos = new ArrayList<>();
		for(Flight flight : this.repo.findAll()) {
			dtos.add(this.mapToDto(flight));
		}
		return dtos;
	}
	


}
