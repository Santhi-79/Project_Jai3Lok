package com.efarms.inventoryservice.service;

import java.util.Optional;

import com.efarms.inventoryservice.entity.Inventory;

public interface InventoryService {
	
	Optional<Inventory> getInventoryByProductCode(String productCode);
    Inventory saveInventory(Inventory inventory);
    void updateInventoryQuantity(String productCode, int quantity);
	
	 
}
