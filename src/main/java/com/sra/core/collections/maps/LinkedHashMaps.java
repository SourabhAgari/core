package com.sra.core.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        // order is maintained in linkedHashMap
        // also access order can be maintained by passing accessOrder as true in constructor of linkedHashMap
        Map<String,Integer> linkedHashMap =new LinkedHashMap<>();
        linkedHashMap.put("one",1);
        linkedHashMap.put("two",2);
        linkedHashMap.put("three",3);
        linkedHashMap.put("four",4);
        System.out.println(linkedHashMap);

        Map<Integer,Integer> linkedHashMap2 = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap2.put(1,8);
        linkedHashMap2.put(2,7);
        linkedHashMap2.put(3,6);
        linkedHashMap2.put(4,5);

        linkedHashMap2.get(3);
        linkedHashMap2.forEach(((val1, val2) -> System.out.println(val1+" "+val2)));
        linkedHashMap2.get(7);
        linkedHashMap2.forEach(((val1, val2) -> System.out.println(val1+" "+val2)));


    }
}
