package validator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.stream.Stream;

@Data
@AllArgsConstructor
@Builder
public class Parcel implements Validator {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    private boolean isValid;


    @Override
    public boolean validate(Parcel input) {
        this.isValid = Stream.of(
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

}
