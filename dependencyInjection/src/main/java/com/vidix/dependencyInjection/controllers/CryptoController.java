package com.vidix.dependencyInjection.controllers;

import com.vidix.dependencyInjection.services.CryptoPriceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CryptoController {

    private final CryptoPriceService cryptoPriceService;

    public CryptoController(@Qualifier("cryptoService") CryptoPriceService cryptoPriceService) {
        this.cryptoPriceService = cryptoPriceService;
    }

    public float getCryptoPrice() {
        return cryptoPriceService.price();
    }
}
