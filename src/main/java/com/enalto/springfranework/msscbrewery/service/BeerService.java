package com.enalto.springfranework.msscbrewery.service;


import com.enalto.springfranework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
