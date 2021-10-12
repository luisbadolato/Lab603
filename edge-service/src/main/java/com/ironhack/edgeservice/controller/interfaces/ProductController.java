package com.ironhack.edgeservice.controller.interfaces;

import com.ironhack.edgeservice.controller.dto.ProductDTO;

public interface ProductController {

    ProductDTO getProduct(Long serial);
}
