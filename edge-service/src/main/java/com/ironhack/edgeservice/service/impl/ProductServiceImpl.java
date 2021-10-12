package com.ironhack.edgeservice.service.impl;

import com.ironhack.edgeservice.client.InventoryClient;
import com.ironhack.edgeservice.client.PriceClient;
import com.ironhack.edgeservice.controller.dto.InventoryDTO;
import com.ironhack.edgeservice.controller.dto.PriceDTO;
import com.ironhack.edgeservice.controller.dto.ProductDTO;
import com.ironhack.edgeservice.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private InventoryClient inventoryClient;
    @Autowired
    private PriceClient priceClient;


    @Override
    public ProductDTO getProduct(Long serial) {
        InventoryDTO inventoryDTO = inventoryClient.getInventoryBySerialNumber(serial);
        PriceDTO priceDTO = priceClient.getBySerialNumber(serial);
        if (inventoryDTO.getSerialNumber() == null || priceDTO.getSerialNumber() == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "There's no product in stock with serial number " + serial);
        }
        ProductDTO productDTO = new ProductDTO();
        productDTO.setSerialNumber(serial);
        productDTO.setProductName(priceDTO.getProductName());
        productDTO.setPrice(priceDTO.getPrice());
        productDTO.setQuantity(inventoryDTO.getQuantity());
        return productDTO;
    }
}
