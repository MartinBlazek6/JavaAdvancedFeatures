package org.example.cars;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class Car {
    private String model;
    private Double price;
    private Date yearOfManufacture;
    private EngineType engineType;
    private Manufacturer manufacturer;

}
