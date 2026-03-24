package com.sra.dsa.twopointers.arrays;

import java.util.Arrays;

public class sqauresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    private static  int[] sortedSquares(int[] nums){
        int length = nums.length;
        int[] result = new int[length];
        int left = 0, right = length - 1;
        for(int i = length-1; i>=0; i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
