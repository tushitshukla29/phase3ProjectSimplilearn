package com.simplilearn.phase3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.phase3.model.Products;
import com.simplilearn.phase3.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> getAllProducts(){
		return productRepository.findAll();
	}

	public void addProduct(Products product) {
		productRepository.save(product);
		
	}

	public Products getProductById(int id) {
		return productRepository.findById(id);
	}

	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}
	
	public List<Products> homeSearch(String keyword) {
		return productRepository.homeSearch(keyword);
	}
}
