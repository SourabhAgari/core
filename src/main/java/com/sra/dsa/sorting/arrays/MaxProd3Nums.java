package com.sra.dsa.sorting.arrays;

import java.util.Arrays;

public class MaxProd3Nums {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(maximumProduct(nums));
    }

    private static int maximumProduct(int[] nums){
        int max = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int num: nums){
            if(num > max) max = num;
            if(num < min1){
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        System.out.println("max: " + max + " min1: " + min1 + " min2: " + min2);
        return max * min1 * min2;
    }
}
