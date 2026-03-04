package com.sra.core.collections.iterable.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Collection methods
        System.out.println("Size is:"+numbers.size());
        System.out.println("Is empty:"+numbers.isEmpty());
        System.out.println("Contains 3:"+numbers.contains(3));
        System.out.println("To Array:"+numbers.toArray());

        // add
        numbers.add(6);
        System.out.println("After add:"+numbers);

        // remove
        System.out.println("After remove:"+numbers.remove(3));
        System.out.println("After remove:"+numbers);

        System.out.println("removing all the elements");
        numbers.removeAll(numbers);
        System.out.println(numbers);

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("After addAll:"+numbers);
    }
}
