package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String encodePassword(String password) {
		return new BCryptPasswordEncoder().encode(password);
	}
	
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
