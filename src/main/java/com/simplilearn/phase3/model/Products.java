package com.simplilearn.phase3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private int id;
	private String company;
	private String name;
	private float price;
	private String category;
	
	public Products(int id, String company, String name, float price, String category) {
		super();
		this.id = id;
		this.company = company;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public Products() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}