package com.ironhack.priceservice.controller.interfaces;

import com.ironhack.priceservice.controller.dto.PriceDTO;

public interface PriceController {

    PriceDTO getBySerialNumber(Long serial);

}
