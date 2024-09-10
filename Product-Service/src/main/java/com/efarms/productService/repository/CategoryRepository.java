package com.efarms.productService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efarms.productService.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	public Category findByName(String name);
	

}
