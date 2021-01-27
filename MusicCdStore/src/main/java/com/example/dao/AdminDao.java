package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Admin;
import com.example.model.User;

public interface AdminDao extends JpaRepository<Admin, Long> {
	public Admin findByUsername(@Param("username") String username);
}
