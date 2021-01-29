package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Customer;
import com.example.model.Role;
import com.example.service.CustomerService;

@Controller
public class UserController{

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/login")
	public String login() 
	{
		return "login";		
	}

	@GetMapping("/admin/customers/all")
	public ModelAndView getAllCustomers() {
		ModelAndView mv = new ModelAndView("customers");
		List<Customer> customerList = customerService.getAllCustomer();
		mv.addObject("customerList", customerList);
		return mv;
	}

	@RequestMapping(value = { "/admin/customers/add", "/register" }, method = RequestMethod.GET)
	public ModelAndView addCustomer() {
		Customer customer = new Customer();
		ModelAndView mv = new ModelAndView("user-form");
		String userChanged = "none";
		mv.addObject("userChanged", userChanged);
		mv.addObject("customer", customer);
		return mv;
	}

	@RequestMapping(value = "/admin/customers/add", method = RequestMethod.POST)
	public ModelAndView addCustomerByAdmin(Customer customer) {
		customerService.addCustomer(customer);
		ModelAndView mv = new ModelAndView("user-form");
		String userChanged = "added";
		mv.addObject("userChanged", userChanged);
		return mv;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView addCustomerByRegister(Customer customer) {
		customerService.addCustomer(customer);
		ModelAndView mv = new ModelAndView("customer-dashboard");
		String userChanged = "added";
		mv.addObject("userChanged", userChanged);
		return mv;
	}

	@RequestMapping(value = { "/admin/customers/update/{customerId}",
			"/user/{customerId}/update" }, method = RequestMethod.GET)
	public ModelAndView updateCustomer(@PathVariable("customerId") long customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		ModelAndView mv = new ModelAndView("user-form");
		String userChanged = "none";
		mv.addObject("userChanged", userChanged);
		mv.addObject("customer", customer);
		return mv;
	}
	
	@RequestMapping(value = "/admin/customers/update/{customerId}", method = RequestMethod.POST)
	public ModelAndView updateCustomerByAdmin(Customer customer) {
		customerService.updateCustomer(customer);
		ModelAndView mv = new ModelAndView("customers");
		String userChanged = "updated";
		mv.addObject("userChanged", userChanged);
		return mv;
	}

	@RequestMapping(value = "/user/{customerId}/update", method = RequestMethod.POST)
	public ModelAndView UpdateCustomerByCustomer(Customer customer) {
		customerService.updateCustomer(customer);
		ModelAndView mv = new ModelAndView("customer-dashboard");
		String userChanged = "updated";
		mv.addObject("userChanged", userChanged);
		return mv;
	}
}
