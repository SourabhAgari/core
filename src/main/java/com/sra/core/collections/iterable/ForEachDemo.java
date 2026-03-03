package com.sra.core.collections.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>(Arrays.asList(100.0, 200.0, 300.0, 400.0, 500.0));

        numbers.forEach(price -> {
            System.out.println(price * 0.9);
        });
    }
}
