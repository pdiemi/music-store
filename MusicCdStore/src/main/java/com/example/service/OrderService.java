package com.example.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.model.Orders;
import com.example.repository.OrdersRepository;

@Service
public class OrderService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	public List<Orders> getAllOrders(){
		return ordersRepository.findAll();
	}
	
	public Orders getOrderById(Long orderNumber) {
		return ordersRepository.findById(orderNumber).get();
	}
	
	public List<Orders> getOrdersByCustomer(Customer customer){
		return ordersRepository.findAllByCustomer(customer);
	}
	
	public List<Orders> getOrdersByDate(Date orderDate){
		return ordersRepository.findAllByOrderDate(orderDate);
	}
	
	public Orders addOrder(Orders order) {
		return ordersRepository.save(order);
	}
	
	public Orders updateOrder(Orders order) {
		ordersRepository.delete(order);
		return ordersRepository.save(order);
	}
	
	public void deleteOrder(Orders order) {
		ordersRepository.delete(order);
	}
}
