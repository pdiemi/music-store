package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.OrdersDao;
import com.example.model.Customer;
import com.example.model.OrderDetail;
import com.example.model.Orders;
import com.example.model.Product;
import com.example.service.CustomerService;
import com.example.service.OrderDetailService;
import com.example.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderDetailService orderDetailService;
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = { "/user/{customerId}/orders/all",
			"/admin/{customerId}/orders/all" }, method = RequestMethod.GET)
	public ModelAndView getAllOrders(@PathVariable long customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		List<Orders> orderList = orderService.getOrdersByCustomer(customer);
		return new ModelAndView("orders", "orderList", orderList);
	}

	@RequestMapping(value = { "/user/{customerId}/orders/{orderNumber}",
			"/admin/{customerId}/orders/{orderNumber}" }, method = RequestMethod.GET)
	public ModelAndView getOrderById(@PathVariable("orderNumber") long orderNumber) {
		Orders order = orderService.getOrderById(orderNumber);
		List<OrderDetail> orderDetail = orderDetailService.getOrderDetailByOrder(order);
		ModelAndView mv = new ModelAndView("order-detail");
		mv.addObject("order", order);
		mv.addObject("orderDetail", orderDetail);
		return mv;
	}

	
}
