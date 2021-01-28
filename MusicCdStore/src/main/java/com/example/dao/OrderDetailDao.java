package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.OrderDetail;
import com.example.model.OrderDetailId;
import com.example.model.Orders;
import com.example.model.Product;

public interface OrderDetailDao extends JpaRepository<OrderDetail,OrderDetailId> {
	public List<OrderDetail> findAllByOrder(@Param("order") Orders order);
	public List<OrderDetail> findAllByProduct(@Param("product") Product product);
}
