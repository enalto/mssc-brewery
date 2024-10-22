package com.enalto.springfranework.msscbrewery.service;

import com.enalto.springfranework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
