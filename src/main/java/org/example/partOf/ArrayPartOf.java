package org.example.partOf;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class ArrayPartOf {
    public static <T> double partOf(List<Optional<T>> list, Optional<T> targetOptional) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty.");
        }

        int totalItems = list.size();
        int occurrences = 0;

        for (Optional<T> optionalItem : list) {
            if (optionalItem.equals(targetOptional)) {
                occurrences++;
            }
        }

        return ((double) occurrences / totalItems) * 100.0;
    }
}
