package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Admin;
import com.example.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	public List<Admin> getAllAdmin() {
		return adminRepository.findAll();
	}
	
	public Admin getAdminById(long id) {
		return adminRepository.findById(id).get();
	}
	
	/*
	 * public Admin getAdminByUsername(String username) { return
	 * adminRepository.findByUsername(username); }
	 */
	
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public Admin updateAdmin(Admin admin) {
		adminRepository.delete(admin);
		return adminRepository.save(admin);
	}
	
	public void deleteAdmin(Admin admin) {
		adminRepository.delete(admin);
	}
}
