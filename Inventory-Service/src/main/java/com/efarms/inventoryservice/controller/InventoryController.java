package com.efarms.inventoryservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efarms.inventoryservice.entity.Inventory;
import com.efarms.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
	
	@Autowired
    private InventoryService inventoryService;

    @GetMapping("/{productCode}")
    public ResponseEntity<Inventory> getInventoryByProductCode(@PathVariable String productCode) {
        Optional<Inventory> inventory = inventoryService.getInventoryByProductCode(productCode);
        return inventory.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Inventory> saveInventory(@RequestBody Inventory inventory) {
        Inventory savedInventory = inventoryService.saveInventory(inventory);
        return ResponseEntity.ok(savedInventory);
    }

    @PutMapping("/{productCode}/updateQuantity")
    public ResponseEntity<Void> updateInventoryQuantity(@PathVariable String productCode, @RequestParam int quantity) {
        inventoryService.updateInventoryQuantity(productCode, quantity);
        return ResponseEntity.ok().build();
    }

}
