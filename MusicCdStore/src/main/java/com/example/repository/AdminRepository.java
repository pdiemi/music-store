package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Admin;
import com.example.model.User;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	public Admin findByUsername(String username);
	@Query(value = "SELECT userEmail FROM Admin")
	List<String> findAllUserEmail();
	@Query(value = "SELECT username FROM Admin")
	List<String> findAllUsername();
}
