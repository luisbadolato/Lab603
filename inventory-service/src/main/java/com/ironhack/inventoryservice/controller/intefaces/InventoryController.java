package com.ironhack.inventoryservice.controller.intefaces;

import com.ironhack.inventoryservice.controller.dto.InventoryDTO;

public interface InventoryController {

    InventoryDTO getInventoryBySerialNumber(Long serial);

}
