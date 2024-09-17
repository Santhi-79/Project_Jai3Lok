package com.efarms.inventoryservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String productCode;
	    private String productName;
	    private int quantity;

	    // Constructors
	    public Inventory() {}

	    public Inventory(String productCode, String productName, int quantity) {
	        this.productCode = productCode;
	        this.productName = productName;
	        this.quantity = quantity;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getProductCode() {
	        return productCode;
	    }

	    public void setProductCode(String productCode) {
	        this.productCode = productCode;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }


}
