package com.simplilearn.phase3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.phase3.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
