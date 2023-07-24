package org.example.cars;

import lombok.Data;

import java.util.Date;

@Data
public class Car {
    private String name;
    private String model;
    private Double price;
    private Date yearOfManufacture;
    private EngineType engineType;

}
