package com.ironhack.edgeservice.service.interfaces;

import com.ironhack.edgeservice.controller.dto.ProductDTO;

public interface ProductService {

    ProductDTO getProduct(Long serial);

}
