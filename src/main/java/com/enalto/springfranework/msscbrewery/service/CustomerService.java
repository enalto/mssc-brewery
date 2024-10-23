package com.enalto.springfranework.msscbrewery.service;

import com.enalto.springfranework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
