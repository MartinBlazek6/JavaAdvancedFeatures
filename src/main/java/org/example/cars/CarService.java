package org.example.cars;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor

public class CarService {


    private List<Car> cars;


    public CarService() {
        this.cars = new ArrayList<>();
    }


    //1
    public void addCar(Car car) {
        cars.add(car);
    }

    //2
    public void removeCar(Car car) {
        cars.remove(car);
    }


//3
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }


//4
    public List<Car> getCarsWithByEngineType(EngineType engineType) {
        return cars.stream()
                .filter(car -> car.getEngineType() == engineType)
                .collect(Collectors.toList());
    }


    //6
    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }

    //7
    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }


    //8
    //todo


    //9
    public List<Car> getCarsSortedByPrice(boolean ascending) {
        Comparator<Car> comparator = Comparator.comparingDouble(Car::getPrice);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        return cars.stream().sorted(comparator).collect(Collectors.toList());
    }


    //10
    public boolean containsCar(Car car) {
        return cars.contains(car);
    }



//11
    public List<Car> carsByManufacturer(Manufacturer manufacturer){
      return   cars.stream().filter(x->x.getManufacturer().equals(manufacturer)).toList();
    }

    //12
    private boolean evaluateYearComparison(int carYear, String operator, int year) {
        return switch (operator) {
            case "<" -> carYear < year;
            case "<=" -> carYear <= year;
            case ">" -> carYear > year;
            case ">=" -> carYear >= year;
            case "=" -> carYear == year;
            case "!=" -> carYear != year;
            default -> false;
        };
    }
}
