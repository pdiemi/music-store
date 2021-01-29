package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Admin;
import com.example.model.User;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	public Admin findByUsername(String username);
}
