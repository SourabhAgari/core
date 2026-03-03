package com.sra.core.collections.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>(Arrays.asList(100.0, 200.0, 300.0, 400.0, 500.0));

        Iterator<Double> it = prices.iterator();
        while(it.hasNext()){
            double price = it.next();
            if(price < 150.0){
                it.remove();
            }
            else System.out.println(price*0.9);
        }

        System.out.println(prices);
    }
}
