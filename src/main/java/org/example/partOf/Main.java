package org.example.partOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.example.partOf.ArrayPartOf.*;

public class Main {
    public static void main(String[] args) {

        List<String> stringList2 = new ArrayList<>(List.of("apple", "banana", "grape"));
        List<Integer> stringList3 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0,1));
        List<Boolean> stringList4 = new ArrayList<>(List.of(true,true,true,false,false,false));


        System.out.println(partOf(stringList2,"apple"));
        System.out.println(partOf(stringList3,1));
        System.out.println(partOf(stringList4,false));
        System.out.println(partOf(new ArrayList<>(),false));


    }
}
