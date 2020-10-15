package com.tts.h2explore.repository;

import java.util.List;

import com.tts.h2explore.domain.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

	List<Customer> findByLastName(String lastName);

	
}
