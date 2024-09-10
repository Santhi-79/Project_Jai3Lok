package com.efarms.productService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efarms.productService.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
	public List<Product> findTop10ByOrderByCreatedAtDesc();
}
