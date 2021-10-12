package com.ironhack.priceservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Price {

    @Id
    private Long serialNumber;
    private String productName;
    private Double price;

    public Price() {
    }

    public Price(Long serialNumber, String productName, Double price) {
        this.serialNumber = serialNumber;
        this.productName = productName;
        this.price = price;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
