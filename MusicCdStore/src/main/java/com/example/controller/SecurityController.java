package com.example.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Admin;
import com.example.model.Customer;
import com.example.model.User;
import com.example.service.AdminService;
import com.example.service.CustomerService;

@Controller
public class SecurityController {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private AdminService adminService;

	@GetMapping("/")
	public ModelAndView getHomePage() {
		return new ModelAndView("index");
	}

	@RequestMapping("/login")
	public String preLogin(HttpSession session) {
		return "login";
	}

	@RequestMapping(value = "/index/user={username}", method = RequestMethod.GET)
    public ModelAndView postLogin(HttpServletRequest request) {
        Principal principal = request.getUserPrincipal();
        String currentUsername = principal.getName();
        System.out.println(currentUsername);
        Admin admin = adminService.getAdminByUsername(currentUsername);
        if (admin != null) {
        	return new ModelAndView("console", "user", admin);
        }
        else {
        	Customer customer = customerService.getCustomerByUsername(currentUsername);
        	if (customer != null) {
        		return new ModelAndView("index2", "user", customer);
        	}
        }
        return new ModelAndView("index2", "user", null);
    }
	

}
