package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MusicCdStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicCdStoreApplication.class, args);
		
		String password = "admin";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		System.out.println("===========================================");
		System.out.println(hashedPassword);
		System.out.println("===========================================");
		
	}

}
