package org.example.validator;

import lombok.Data;

import java.util.stream.Stream;

@Data
public class Parcel implements Validator {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    private Boolean isValid;

    @Override
    public boolean validate(Parcel input) {
        this.isValid =
        Stream.of(
                validateDimensions(),
                validateWeight()
        ).allMatch(result -> result);
        return isValid;
    }

    private boolean validateDimensions() {
        int sumOfDimensions = xLength + yLength + zLength;
        return xLength >= 30 && yLength >= 30 && zLength >= 30 && sumOfDimensions <= 300;
    }

    private boolean validateWeight() {
        float maxWeight = isExpress ? 15.0f : 30.0f;
        return weight <= maxWeight;
    }

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }
}
