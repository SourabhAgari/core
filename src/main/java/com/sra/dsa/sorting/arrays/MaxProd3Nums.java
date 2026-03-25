package com.sra.dsa.sorting.arrays;

import java.util.Arrays;

public class MaxProd3Nums {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

    private static int maximumProduct(int[] nums){
        Arrays.sort(nums);
        int length = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<length-2;i++){
            int product = nums[i] * nums[i+1] * nums[i+2];
            max = Math.max(max, product);
            System.out.println(max);
        }
        return max;

    }
}
