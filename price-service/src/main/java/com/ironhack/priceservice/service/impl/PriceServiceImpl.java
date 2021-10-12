package com.ironhack.priceservice.service.impl;

import com.ironhack.priceservice.controller.dto.PriceDTO;
import com.ironhack.priceservice.model.Price;
import com.ironhack.priceservice.repository.PriceRepository;
import com.ironhack.priceservice.service.interfaces.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Override
    public PriceDTO getBySerialNumber(Long serial) {
        Price price = priceRepository.findBySerialNumber(serial)
                .orElseThrow(()-> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Price with serial number " + serial + " not found")
                );
        PriceDTO priceDTO = new PriceDTO();
        priceDTO.setSerialNumber(price.getSerialNumber());
        priceDTO.setProductName(price.getProductName());
        priceDTO.setPrice(price.getPrice());
        return priceDTO;
    }
}
