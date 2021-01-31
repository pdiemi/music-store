package com.example.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String encodePassword(String password) {
		return new BCryptPasswordEncoder().encode(password);
	}

}
