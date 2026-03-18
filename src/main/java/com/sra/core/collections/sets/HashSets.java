package com.sra.core.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<Integer> hasSet = new HashSet<>();
        hasSet.add(1);
        hasSet.add(2);
        hasSet.add(3);
        hasSet.add(4);
        hasSet.add(4);

        hasSet.forEach((val) -> System.out.println(val));
    }
}
