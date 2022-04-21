package com.simplilearn.phase3.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.phase3.model.Purchase;
import com.simplilearn.phase3.repository.ProductRepository;
import com.simplilearn.phase3.repository.PurchaseRepository;

@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Purchase> getAllPurchases(){
		return purchaseRepository.findAll();
	}
	
	public List<Purchase> getByEmail(String email){ 
		 return	 purchaseRepository.getByEmail(email);  
	}

	public List<Purchase> getPurchaseByDate(Date keyword) {
		return purchaseRepository.findByDop(keyword);
	}
	
	public List<Purchase> getPurchaseByCategory(String keyword) {
		List<Purchase> sPurchase = new ArrayList<>();
		List<Integer> productIds = productRepository.getByCategory(keyword);
		if (!productIds.isEmpty()) {
			for (int id : productIds) {
				List<Purchase> tempList = purchaseRepository.findByproductid(id);
				if (!tempList.isEmpty()) {
					for (Purchase p : tempList) {
						sPurchase.add(p);
					}
				}
			}
		}
		return sPurchase;
	}

	public void deletePurchase(int id) {
		purchaseRepository.deleteById(id);
		
	}

	public void addPurchase(Purchase purchase) {
		purchaseRepository.save(purchase);
	}
}
