package com.qa.airline.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.airline.persistence.domain.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {

}
