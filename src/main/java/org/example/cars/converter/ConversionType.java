package org.example.cars.converter;

public enum ConversionType {
    METERS_TO_YARDS("Meters to Yards", new MetersToYardsConverter()),
    YARDS_TO_METERS("Yards to Meters", new YardsToMetersConverter()),
    CENTIMETERS_TO_INCHES("Centimeters to Inches", new CentimetersToInchesConverter()),
    INCHES_TO_CENTIMETERS("Inches to Centimeters", new InchesToCentimetersConverter()),
    KILOMETERS_TO_MILES("Kilometers to Miles", new KilometersToMilesConverter()),
    MILES_TO_KILOMETERS("Miles to Kilometers", new MilesToKilometersConverter());

    private final String displayName;
    private final Converter converter;

    ConversionType(String displayName, Converter converter) {
        this.displayName = displayName;
        this.converter = converter;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Converter getConverter() {
        return converter;
    }
}

interface Converter {
    double convert(double value);
}

class MetersToYardsConverter implements Converter {
    @Override
    public double convert(double value) {
        return value * 1.09361;
    }
}

class YardsToMetersConverter implements Converter {
    @Override
    public double convert(double value) {
        return value / 1.09361;
    }
}

class CentimetersToInchesConverter implements Converter {
    @Override
    public double convert(double value) {
        return value / 2.54;
    }
}

class InchesToCentimetersConverter implements Converter {
    @Override
    public double convert(double value) {
        return value * 2.54;
    }
}

class KilometersToMilesConverter implements Converter {
    @Override
    public double convert(double value) {
        return value / 1.60934;
    }
}

class MilesToKilometersConverter implements Converter {
    @Override
    public double convert(double value) {
        return value * 1.60934;
    }
}

