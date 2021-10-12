package com.ironhack.inventoryservice.controller.dto;

public class InventoryDTO {

    private Long serialNumber;
    private int quantity;

    public InventoryDTO() {
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
