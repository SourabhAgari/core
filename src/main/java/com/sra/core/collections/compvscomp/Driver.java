package com.sra.core.collections.compvscomp;

import com.sra.core.collections.collection.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 20, 85, "New York"),
                new Student("Bob", 21, 90, "Los Angeles"),
                new Student("Charlie", 22, 80, "Chicago")
        ));

        Collections.sort(students);
        System.out.println(students);

        // now what if i want to sort by age instead of score?
        // doesn't work because we have not defined a comparator for age

        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Collections.sort(students, nameComparator);
        System.out.println(students);


    }
}
