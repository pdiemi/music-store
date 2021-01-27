package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Orders;

public interface OrdersDao extends JpaRepository<Orders, Long>{

}
