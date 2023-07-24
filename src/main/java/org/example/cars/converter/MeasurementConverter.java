package org.example.cars.converter;

public class MeasurementConverter {
    public static double convert(int value, ConversionType conversionType) {
        return conversionType.getConverter().convert(value);
    }

    public static void main(String[] args) {
        int value = 10;
        double result = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(value + " meters is equal to " + result + " yards.");

        result = MeasurementConverter.convert(value, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(value + " centimeters is equal to " + result + " inches.");

        result = MeasurementConverter.convert(value, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(value + " kilometers is equal to " + result + " miles.");

        result = MeasurementConverter.convert(value, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(value + " miles is equal to " + result + " kilometers.");
    }
}
