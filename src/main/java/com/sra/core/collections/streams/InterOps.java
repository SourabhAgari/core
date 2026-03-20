package com.sra.core.collections.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterOps {
    public static void main(String[] args) {
        List<String> listOfWords = List.of("Hello","How","Are","You","Doing","Today");
        System.out.println("Filter Operation Output:"+ InterOps.filter(listOfWords).collect(Collectors.toList()));
        System.out.println("Map Operation Output:"+
                InterOps.mapOperation(listOfWords).collect(Collectors.toList()));
        System.out.println("FlatMap Operation Output:"+
                InterOps.flatMapOperation(listOfWords).collect(Collectors.toList()));

        List<List<Integer>> listOfLists = new ArrayList<>();

        listOfLists.add(List.of(1, 2, 3));
        listOfLists.add(List.of(4, 5));
        listOfLists.add(List.of(6, 7, 8));

        System.out.println("FlatMap Operation on List of Lists Output:"+
                listOfLists.stream().flatMap(list -> list
                        .stream().map(nums -> nums * 5)).collect(Collectors.toList()));

        System.out.println("Distinct Operation Output:"+
                listOfWords.stream().filter(s -> s.length() > 3).distinct().collect(Collectors.toList()));

        System.out.println("Sorted Operation Output:"+
                listOfWords.stream().filter(s -> s.length() > 3).sorted().collect(Collectors.toList()));

        System.out.println("Sorted in reverse order:"+
                listOfWords.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Peek Operation Output:"+
                numbers.stream().filter(x -> x % 2 == 0).peek(x -> System.out.println("Even number: "+x)).toList());

    }

    private static Stream<String> filter(List<String> list){
        return list.stream().filter(s -> s.length() > 3);
    }

    private static Stream<String> mapOperation(List<String> list){
        return list.stream().map(s -> s.toUpperCase());
    }

    private static Stream<String> flatMapOperation(List<String> list){
        return list.stream().filter(s -> s.length() > 3)
                .flatMap(s -> Arrays.stream(s.split("")));
    }
}
