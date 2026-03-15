package com.sra.core.collections.list;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(0,100);
        System.out.println(vector);
    }
}
