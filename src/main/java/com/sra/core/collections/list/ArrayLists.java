package com.sra.core.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0,100);
        numbers.add(1,200);
        numbers.add(2,300);

        List<Integer> newNumbers = List.of(400,500,600);
        numbers.addAll(newNumbers);

        System.out.println(numbers);

        numbers.add(2,450);
        System.out.println(numbers);

        // unary operators
        numbers.replaceAll(n -> n*2);
        numbers.forEach(n -> System.out.println(n));

        System.out.println("Sorted");
        numbers.sort((n1, n2) -> n1 - n2);
        System.out.println(numbers);

        System.out.println("Reversed");
        numbers.sort((n1,n2)-> n2 - n1);
        System.out.println(numbers);

        System.out.println("Fetch from a particular index");
        System.out.println(numbers.get(2));

        System.out.println("After Remove from 0 index");
        numbers.remove(0);
        System.out.println(numbers);

        System.out.println("Index of a particular element 900 is");
        System.out.println(numbers.indexOf(900));


        System.out.println("Using List Iterator");
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()){
            Integer e = listIterator.next();
            if(e == 900){
                listIterator.remove();
            }
            System.out.println(e);
        }
        System.out.println(numbers);


        System.out.println("Using List Iterator in reverse order");
        ListIterator<Integer> listIteratorReverse = numbers.listIterator(numbers.size());
        while (listIteratorReverse.hasPrevious()){
            Integer e = listIteratorReverse.previous();
            System.out.println(e);
        }

        System.out.println("Sub List of a list");
        List<Integer> subList = numbers.subList(2, 4);
        System.out.println(subList);

        System.out.println(numbers);
        subList.add(500);
        System.out.println(subList);
        System.out.println(numbers);

    }
}
