package org.example.computer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
public class Laptop extends Computer{
    private String Battery;
}
