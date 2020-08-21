package com.qa.airline.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.airline.persistence.domain.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
