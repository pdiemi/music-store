package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	public Customer getCustomerById(Long customerId) {
		return customerRepository.findById(customerId).get();
	}

	public Customer getCustomerByUsername(String username) {
		return customerRepository.findByUsername(username);
	}

	public Customer getCustomerByEmail(String email) {
		return customerRepository.findByUserEmail(email);
	}

	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		customerRepository.delete(customer);
		return customerRepository.save(customer);
	}

	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
	}
}
