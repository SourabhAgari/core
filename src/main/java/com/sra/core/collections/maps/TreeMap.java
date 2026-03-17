package com.sra.core.collections.maps;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        // reverse order
        Map<Integer,Integer> treeMap = new java.util.TreeMap<>((a,b)->b-a);
        treeMap.put(8,100);
        treeMap.put(3,200);
        treeMap.forEach((val1,val2)-> System.out.println(val1+" "+val2));
    }
}
