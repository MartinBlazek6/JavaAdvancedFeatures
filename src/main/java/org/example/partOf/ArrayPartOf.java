package org.example.partOf;

import java.util.Arrays;
import java.util.Collections;
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

    public static <T> String partOf(List<T> list, T element) {
        if (list.isEmpty()){
            throw new RuntimeException("List cannot be empty");
        } else if (list.contains(null)) {
            throw new RuntimeException("List cannot contain null value");
        }

        return element + " is occurred with: "
                + ((double) (int) list.stream().filter(item -> item.equals(element)).count() / list.size() * 100) + "%";
    }

}

