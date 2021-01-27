package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AdminDao;
import com.example.model.Admin;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;

	public List<Admin> getAllAdmin() {
		return adminDao.findAll();
	}
	
	public Admin getAdminById(long id) {
		return adminDao.findById(id).get();
	}
	
	public Admin getAdminByUsername(String username) {
		return adminDao.findByUsername(username);
	}
	
	public Admin addAdmin(Admin admin) {
		return adminDao.save(admin);
	}
	
	public Admin updateAdmin(Admin admin) {
		adminDao.delete(admin);
		return adminDao.save(admin);
	}
	
	public void deleteAdmin(Admin admin) {
		adminDao.delete(admin);
	}
}
