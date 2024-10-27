package com.enalto.springfranework.msscbrewery.web.mappers;

import com.enalto.springfranework.msscbrewery.domain.Customer;
import com.enalto.springfranework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {

    CustomerDto toDto(Customer customer);

    Customer toEntity(CustomerDto customerDto);

}
