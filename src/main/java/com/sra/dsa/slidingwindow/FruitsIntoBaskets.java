package com.sra.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        System.out.println(totalFruits(fruits));
    }

    public static int totalFruits(int[] fruits){
        int l = 0, r = 0, max = 0;
        int length = fruits.length;

        Map<Integer,Integer> map = new HashMap<>();

        while (r < length){
            map.put(fruits[r], map.getOrDefault(fruits[r],0) + 1);
            while (map.size() > 2){
                map.put(fruits[l],map.get(fruits[l]) - 1);
                if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}
