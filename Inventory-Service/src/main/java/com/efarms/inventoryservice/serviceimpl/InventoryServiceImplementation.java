package com.efarms.inventoryservice.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarms.inventoryservice.entity.Inventory;
import com.efarms.inventoryservice.repository.InventoryRepository;
import com.efarms.inventoryservice.service.InventoryService;

@Service
public class InventoryServiceImplementation implements InventoryService{
	
	@Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Optional<Inventory> getInventoryByProductCode(String productCode) {
        return inventoryRepository.findByProductCode(productCode);
    }

    @Override
    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public void updateInventoryQuantity(String productCode, int quantity) {
        Optional<Inventory> inventoryOptional = inventoryRepository.findByProductCode(productCode);
        if (inventoryOptional.isPresent()) {
            Inventory inventory = inventoryOptional.get();
            inventory.setQuantity(quantity);
            inventoryRepository.save(inventory);
        }
    }

}
