package com.example.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.OrdersDao;
import com.example.model.Customer;
import com.example.model.Orders;

@Service
public class OrderService {

	@Autowired
	private OrdersDao ordersDao;
	
	public List<Orders> getAllOrders(){
		return ordersDao.findAll();
	}
	
	public Orders getOrderById(Long orderNumber) {
		return ordersDao.findById(orderNumber).get();
	}
	
	public List<Orders> getOrdersByCustomer(Customer customer){
		return ordersDao.findAllByCustomer(customer);
	}
	
	public List<Orders> getOrdersByDate(Date orderDate){
		return ordersDao.findAllByOrderDate(orderDate);
	}
	
	public Orders addOrder(Orders order) {
		return ordersDao.save(order);
	}
	
	public Orders updateOrder(Orders order) {
		ordersDao.delete(order);
		return ordersDao.save(order);
	}
	
	public void deleteOrder(Orders order) {
		ordersDao.delete(order);
	}
}
