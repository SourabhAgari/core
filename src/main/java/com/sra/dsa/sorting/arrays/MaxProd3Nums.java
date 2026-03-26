package com.sra.dsa.sorting.arrays;

import java.util.Arrays;

public class MaxProd3Nums {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(maximumProduct(nums));
    }

    private static int maximumProduct(int[] nums){
        Arrays.sort(nums);
        int length = nums.length;
        if(length < 3) return -1;
        return Math.max(nums[length-1]*nums[length-2]*nums[length-3],
                nums[0]*nums[1]*nums[length-1]);
    }
}
