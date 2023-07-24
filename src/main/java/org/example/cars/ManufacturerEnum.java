package org.example.cars;

public enum ManufacturerEnum {
    FERRARI("Ferrari",  true),
    PORSCHE("Porsche", true),
    MERCEDES("Mercedes", true),
    BMW("BMW",  true),
    OPEL("Opel",false),
    FIAT("Fiat",  false),
    TOYOTA("Toyota",  false);

    private final String brand;
    private final boolean premium;
    ManufacturerEnum(String brand,boolean premium) {
        this.brand = brand;
        this.premium = premium;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isPremium() {
        return premium;
    }

    public boolean isRegular() {
        return !isPremium();
    }
}
