package com.sra.core.collections.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeqOfStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,1,4,7,10);
        Stream<Integer> numberStream = list.stream()
                .filter((Integer x) -> x >= 3)
                .peek((Integer x) -> System.out.println("After filter: " + x))
                .map((Integer x) -> (x * -1))
                .peek((Integer val) -> System.out.println("After negating: " + val))
                .sorted()
                .peek((Integer x) -> System.out.println("After sorting: " + x));

        List<Integer> result = numberStream.collect(Collectors.toList());
        System.out.println(result);
    }
}
