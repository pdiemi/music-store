package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.OrderDetail;
import com.example.model.OrderDetailId;

public interface OrderDetailDao extends JpaRepository<OrderDetail,OrderDetailId> {

}
