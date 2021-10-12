package com.ironhack.priceservice.service.interfaces;

import com.ironhack.priceservice.controller.dto.PriceDTO;

public interface PriceService {

    PriceDTO getBySerialNumber(Long serial);

}
