package com.sra.core.collections.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(4);
        linkedHashSet.forEach((val) -> System.out.println(val));
    }
}
