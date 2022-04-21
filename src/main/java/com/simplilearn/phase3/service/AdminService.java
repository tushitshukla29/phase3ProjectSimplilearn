package com.simplilearn.phase3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.phase3.model.Admin;
import com.simplilearn.phase3.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin getAdmin(String username) {
		return adminRepository.findByUsername(username);
	}

	public boolean loginVerify(String username, String password) {
		Admin admin = adminRepository.findByUsername(username);
        if (admin!= null && admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
	}

	public void updatePassword(Admin admin) {
		adminRepository.save(admin);
		
	}

}
