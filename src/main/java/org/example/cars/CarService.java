package org.example.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .collect(Collectors.toList());
    }


    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }


    public List<Car> getCarsSortedByPrice(boolean ascending) {
        Comparator<Car> comparator = Comparator.comparingDouble(Car::getPrice);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        return cars.stream().sorted(comparator).collect(Collectors.toList());
    }

    public boolean containsCar(Car car) {
        return cars.contains(car);
    }



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
