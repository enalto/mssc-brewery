package com.enalto.springfranework.msscbrewery.domain;

import com.enalto.springfranework.msscbrewery.web.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long UPC;

    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
