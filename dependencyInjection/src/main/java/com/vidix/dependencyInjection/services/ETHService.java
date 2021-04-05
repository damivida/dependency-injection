package com.vidix.dependencyInjection.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("cryptoService")
@Profile({"ETH"})
public class ETHService implements CryptoPriceService {

    @Override
    public float price() {
        System.out.println("ETH price:");
        return (float) 2048.67;
    }
}
