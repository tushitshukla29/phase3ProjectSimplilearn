package com.simplilearn.phase3.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simplilearn.phase3.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{

	
	 @Query("SELECT p FROM Purchase p WHERE p.customer.email LIKE %?1%") 
	 public	 List<Purchase> getByEmail(String email);
	 
	 public List<Purchase> findByDop(Date dop);
	 public List<Purchase> findByproductid(int id);
}
