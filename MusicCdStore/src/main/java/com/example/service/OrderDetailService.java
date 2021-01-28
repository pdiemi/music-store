package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.OrderDetailDao;
import com.example.model.OrderDetail;
import com.example.model.OrderDetailId;
import com.example.model.Orders;
import com.example.model.Product;

@Service
public class OrderDetailService {

	@Autowired
	private OrderDetailDao orderDetailDao;
	
	public List<OrderDetail> getAllOrderDetails(){
		return orderDetailDao.findAll();
	}
	
	public OrderDetail getOrderDetailById(OrderDetailId id) {
		return orderDetailDao.findById(id).get();
	}
	
	public List<OrderDetail> getOrderDetailByOrder(Orders order) {
		return orderDetailDao.findAllByOrder(order);
	}
	
	public List<OrderDetail> getOrderDetailByProduct(Product product) {
		return orderDetailDao.findAllByProduct(product);
	}
	
	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		return orderDetailDao.save(orderDetail);
	}
	
	public OrderDetail updateOrderDetail(OrderDetail orderDetail) {
		orderDetailDao.delete(orderDetail);
		return orderDetailDao.save(orderDetail);
	}
	
	public void deleteOrderDetail(OrderDetail orderDetail) {
		orderDetailDao.delete(orderDetail);
	}
}
