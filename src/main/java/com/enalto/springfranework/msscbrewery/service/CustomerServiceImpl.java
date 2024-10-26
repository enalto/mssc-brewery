package com.enalto.springfranework.msscbrewery.service;

import com.enalto.springfranework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Customer")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(@RequestBody CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, @RequestBody CustomerDto customerDto) {
        log.debug("Updating customer {}", customerDto.getId());
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting Id {}", customerId);
    }
}
