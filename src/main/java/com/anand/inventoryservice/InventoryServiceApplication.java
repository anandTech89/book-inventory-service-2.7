package com.anand.inventoryservice;

import com.anand.inventoryservice.model.Inventory;
import com.anand.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository){
        return  args -> {
            Inventory  inventory=new Inventory();
            inventory.setSkuCode("iphone17");
            inventory.setQuantity(10);

            Inventory  inventory1=new Inventory();
            inventory1.setSkuCode("iphone17pro");
            inventory1.setQuantity(5);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
        };
    }

}
