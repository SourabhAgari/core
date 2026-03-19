package com.sra.core.collections.streams;

import java.util.ArrayList;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<Integer> salaries = new ArrayList<>(
                java.util.Arrays.asList(100, 200, 300, 400, 500, 600)
        );

        System.out.println("Without Using Streams:"+salaryGreaterThan300WithoutStreams(salaries));
        System.out.println("With Using Streams:"+salaryGreaterThan300WithStreams(salaries));
    }

    private static long salaryGreaterThan300WithoutStreams(ArrayList<Integer> salaries){
        long count = 0;
        for(Integer salary : salaries){
            if(salary > 300){
                count++;
            }
        }
        return count;
    }

    private static long salaryGreaterThan300WithStreams(ArrayList<Integer> salaries){
        return salaries.stream().filter(salary -> salary > 300).count();
    }
}
