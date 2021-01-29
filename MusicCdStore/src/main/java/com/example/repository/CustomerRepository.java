package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Customer;
import com.example.model.User;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	public Customer findByUsername(String username);
	public Customer findByUserEmail(@Param("userEmail") String userEmail);
}
