package org.example.computer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class Computer {
    private String processor;
    private String ram;
    private String graphicsCard;
    private String company;
}
