package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long>{
	public Customer findByUsername(@Param("username") String username);
	public Customer findByUserEmail(@Param("userEmail") String userEmail);
}
