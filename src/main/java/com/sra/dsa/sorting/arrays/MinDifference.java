package com.sra.dsa.sorting.arrays;

import java.util.Arrays;

public class MinDifference {
    public static void main(String[] args) {
        int[] arr = {90};
        System.out.println(MinDifference.minimumDifference(arr,1));
    }

    private static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (k <= nums.length){
            min = Math.min(min,nums[k-1]-nums[i]);
            i++;
            k++;
        }
        return min;
    }
}
