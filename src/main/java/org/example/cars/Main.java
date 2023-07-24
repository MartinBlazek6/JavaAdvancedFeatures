package org.example.cars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Manufacturer SKODA = Manufacturer.builder()
                .name("SKODA")
                .country("CZ")
                .yeaOfEstablishment(createDate("1.2.1895"))
                .build();


        Car octavia = new Car("Octavia",30000.,createDate("1.2.2007"),EngineType.S4,SKODA);

        final CarService carService = new CarService();

        carService.addCar(octavia);

        System.out.println(carService.getAllCars());




    }

    private static Date createDate(String date) throws ParseException {
        return new SimpleDateFormat("dd.MM.yyyy").parse(date);
    }
}
