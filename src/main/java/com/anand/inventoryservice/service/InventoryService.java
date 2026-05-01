package com.anand.inventoryservice.service;

import com.anand.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode){
      return   inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
