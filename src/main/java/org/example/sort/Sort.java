package org.example.sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        System.out.println(sortZA(List.of("Zhena","Abdul","Buch")));
        System.out.println(sortAZ(List.of("Zhena","Abdul","Buch")));
        System.out.println(sortZALowerCase(List.of("Zhena","Abdul","Buch")));
    }


    private static List<String> sortZA(List<String> list) {
       return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    private static List<String> sortZALowerCase(List<String> list) {
        return list.stream()
                .sorted((s1, s2) -> s2.compareToIgnoreCase(s1))
                .collect(Collectors.toList());
    }

    private static List<String> sortAZ(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }
}
