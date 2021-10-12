package com.ironhack.inventoryservice.service.interfaces;

import com.ironhack.inventoryservice.controller.dto.InventoryDTO;

public interface InventoryService {

    InventoryDTO getInventoryBySerialNumber(Long serial);

}
