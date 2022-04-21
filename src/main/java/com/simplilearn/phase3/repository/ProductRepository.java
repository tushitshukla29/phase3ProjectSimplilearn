package com.simplilearn.phase3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simplilearn.phase3.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {
	Products findById(int id);
	
	@Query("Select id from Products where category Like %?1%")
	List<Integer> getByCategory(String keyword);
	
	@Query("SELECT p FROM Products p WHERE p.company LIKE %?1%"
			+" OR p.name LIKE %?1%"
			+" OR p.price LIKE %?1%"
			+" OR p.category LIKE %?1%")
	public List<Products> homeSearch(String keyword);
}
