package com.enalto.springfranework.msscbrewery.web.mappers;

import com.enalto.springfranework.msscbrewery.domain.Beer;
import com.enalto.springfranework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto toDto(Beer beer);

    Beer toEntity(BeerDto beerDto);

}
