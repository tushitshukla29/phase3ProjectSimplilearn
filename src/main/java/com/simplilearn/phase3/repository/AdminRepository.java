package com.simplilearn.phase3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simplilearn.phase3.model.Admin;



public interface AdminRepository extends JpaRepository<Admin,String>{
	com.simplilearn.phase3.model.Admin findByUsername(String username);
	
	@Query(value="SELECT username FROM admin",nativeQuery=true)
	public List<String> findUsenames();
}
