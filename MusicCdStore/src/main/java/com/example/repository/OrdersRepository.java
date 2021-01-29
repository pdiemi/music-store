package com.example.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Customer;
import com.example.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{
	public List<Orders> findAllByCustomer(@Param("customer") Customer customer);
	public List<Orders> findAllByOrderDate(@Param("orderDate") Date orrderDate);
}
