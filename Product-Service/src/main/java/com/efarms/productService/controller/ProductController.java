package com.efarms.productService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efarms.productService.service.ProductService;

@RestController
@RequestMapping("/api")
	public class ProductController {
		private ProductService productService;
		public ProductController(ProductService productService) {
			this.productService=productService;
		}
	@GetMapping("/products/getAll")	
	public String getProducts() {
		
		return "hello product:";
		
	}
}
