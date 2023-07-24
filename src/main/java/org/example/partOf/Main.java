package org.example.partOf;

import java.util.List;
import java.util.Optional;

import static org.example.partOf.ArrayPartOf.partOf;

public class Main {
    public static void main(String[] args) {
        // Example usage:
        List<Optional<String>> stringList = List.of(
                Optional.of("apple"),
                Optional.of("banana"),
                Optional.empty(),
                Optional.of("grape"),
                Optional.of("apple")
        );

        Optional<String> targetOptional = Optional.of("apple");
        double percentageOccurrences = partOf(stringList, targetOptional);
        System.out.println("Percentage of occurrences of " + targetOptional + ": " + percentageOccurrences + "%");
    }
}
