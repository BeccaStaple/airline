package com.qa.airline.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.airline.persistence.domain.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

}
