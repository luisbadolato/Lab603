package com.ironhack.inventoryservice.service.impl;

import com.ironhack.inventoryservice.controller.dto.InventoryDTO;
import com.ironhack.inventoryservice.model.Inventory;
import com.ironhack.inventoryservice.repository.InventoryRepository;
import com.ironhack.inventoryservice.service.interfaces.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public InventoryDTO getInventoryBySerialNumber(Long serial) {
        Inventory inventory = inventoryRepository.findBySerialNumber(serial)
                .orElseThrow(()-> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Inventory with serial number " + serial + " not found")
                );
        InventoryDTO inventoryDTO = new InventoryDTO();
        inventoryDTO.setSerialNumber(inventory.getSerialNumber());
        inventoryDTO.setQuantity(inventory.getQuantity());
        return inventoryDTO;
    }
}
