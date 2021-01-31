package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Customer;
import com.example.service.CustomerService;

@Controller
public class MainController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/")
	public ModelAndView getHomePage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/index2", method = RequestMethod.GET)
	public ModelAndView home(@PathVariable String username) {
		Customer user = customerService.getCustomerByUsername(username);
		String name = username;
		/*
		 * if (user == null) { name = "Admin"; } else { name = user.getCustomerName(); }
		 */
		return new ModelAndView("index2", "name", name);
	}
}
