package com.ironhack.edgeservice.controller.impl;

import com.ironhack.edgeservice.controller.dto.ProductDTO;
import com.ironhack.edgeservice.controller.interfaces.ProductController;
import com.ironhack.edgeservice.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{serial}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO getProduct(@PathVariable Long serial) {
        return productService.getProduct(serial);
    }
}
