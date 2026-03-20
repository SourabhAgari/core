package com.sra.core.collections.streams;

import java.util.List;

public class TermOps {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // for each
        System.out.println("For Each Output");
        numbers.stream()
                .forEach((Integer val) -> System.out.println("for each: " + val));


        // this will return the object array
        System.out.println(numbers.stream()
                .filter((Integer x) -> x >=3)
                .toArray().getClass());


        // this will return the integer array
        System.out.println(numbers.stream()
                .filter((Integer x) -> x >=3)
                .toArray(Integer[]::new).getClass());


        // Reduce Operation
        System.out.println("Reduce Operation Output");
        System.out.println(numbers.stream()
                .reduce((Integer x, Integer y) -> x + y));

    }
}
