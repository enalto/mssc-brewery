package com.enalto.springfranework.msscbrewery.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @NotNull
    private UUID id;

    @NotNull
    @Size(min = 3, max = 100)
    private String name;
}
