package com.vidix.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("cryptoService")
@Profile({"BTC"," default"})
public class BTCService implements CryptoPriceService {
    @Override
    public float price() {
        System.out.println("BTC price:");
        return (float) 57551.57;
    }
}
