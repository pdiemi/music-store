package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public List<Customer> getAllCustomer() {
		return customerDao.findAll();
	}
	
	public Customer getCustomerById(Long customerId) {
		return customerDao.findById(customerId).get();
	}
	
	public Customer getCustomerByUsername(String username) {
		return customerDao.findByUsername(username);
	}
	
	public Customer getCustomerByEmail(String email) {
		return customerDao.findByUserEmail(email);
	}
	
	public Customer addCustomer(Customer customer) {
		return customerDao.save(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		customerDao.delete(customer);
		return customerDao.save(customer);
	}
	
	public void deleteCustomer(Customer customer) {
		customerDao.delete(customer);
	}
}
