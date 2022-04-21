package com.simplilearn.phase3.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.simplilearn.phase3.model.Products;
import com.simplilearn.phase3.service.ProductService;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/manageProduct")
	public String manageProduct(Model model) {
		model.addAttribute("products",productService.getAllProducts());
		Products product = new Products();
		model.addAttribute("product", product);
		return "manageProduct";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute("product") Products product, Model model, HttpSession session) {
		int min=10000;int max=99999;int b = (int)(Math.random()*(max-min+1)+min);
		product.setId(b);
		productService.addProduct(product);
		session.setAttribute("action","Product Added succesfully");
		model.addAttribute("product", product);
		return "redirect:/manageProduct";
	}
	
	@GetMapping("/showProductUpdate/{id}")
	public String showProductUpdate(@PathVariable(value="id") int id, Model model) {
		Products product = productService.getProductById(id);
		model.addAttribute("product", product);
		return "update_product";
	}
	
	@PostMapping("/updateProduct")
	public String updateProduct(@ModelAttribute("product") Products product, Model model,HttpSession session) {
		productService.addProduct(product);
		session.setAttribute("action","Product Updated succesfully");
		model.addAttribute("product", product);
		return "redirect:/manageProduct";
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable(value="id") int id,Model model,HttpSession session) {
		productService.deleteProduct(id);
		session.setAttribute("action", "Product Deleted Succesfully");
		Products product = new Products();
		model.addAttribute("product", product);
		return "redirect:/manageProduct";
	}
}