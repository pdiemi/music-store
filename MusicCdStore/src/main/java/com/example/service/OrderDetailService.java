package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.OrderDetail;
import com.example.model.OrderDetailId;
import com.example.model.Orders;
import com.example.model.Product;
import com.example.repository.OrderDetailRepository;

@Service
public class OrderDetailService {

	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	public List<OrderDetail> getAllOrderDetails(){
		return orderDetailRepository.findAll();
	}
	
	public OrderDetail getOrderDetailById(OrderDetailId id) {
		return orderDetailRepository.findById(id).get();
	}
	
	public List<OrderDetail> getOrderDetailByOrder(Orders order) {
		return orderDetailRepository.findAllByOrder(order);
	}
	
	public List<OrderDetail> getOrderDetailByProduct(Product product) {
		return orderDetailRepository.findAllByProduct(product);
	}
	
	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		return orderDetailRepository.save(orderDetail);
	}
	
	public OrderDetail updateOrderDetail(OrderDetail orderDetail) {
		orderDetailRepository.delete(orderDetail);
		return orderDetailRepository.save(orderDetail);
	}
	
	public void deleteOrderDetail(OrderDetail orderDetail) {
		orderDetailRepository.delete(orderDetail);
	}
}
