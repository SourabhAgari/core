package com.sra.core.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class General {
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(null,"TEST");
        hm.put(0,null);
        hm.put(1,"TEST1");
        System.out.println(hm);
        hm.put(2,"A");
        hm.put(1,"B");
        System.out.println(hm);
        // only if the key is not already present in the map
        hm.putIfAbsent(1,"J");
        System.out.println(hm);
        hm.putIfAbsent(3,"J");
        System.out.println(hm);


        // iterating over the map
        for(Map.Entry<Integer,String> entry: hm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // isEmpty and size
        System.out.println("Is Map Empty?:"+hm.isEmpty());
        System.out.println("Map Size:"+hm.size());

        // contains Key
        System.out.println("Contains Key 1?:"+hm.containsKey(1));
        System.out.println("Contains Key 4?:"+hm.containsKey(4));

        // get or default
        System.out.println("Get 65 or default:"+hm.getOrDefault(65,"DEFAULT"));

        // iterate over keys and values
        for(Integer key: hm.keySet()){
            System.out.println(key);
        }

        for(String values: hm.values()){
            System.out.println(values);
        }
    }
}
