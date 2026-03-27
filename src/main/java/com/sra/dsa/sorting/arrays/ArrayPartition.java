package com.sra.dsa.sorting.arrays;

public class ArrayPartition {
    public static void main(String[] args) {

    }

    private static int ArrayPairSum(int[] nums){
        int sum = 0;
        if(nums.length == 0 || nums.length < 2) return sum;
        for(int i=0;i< nums.length;i+=2){
            sum += Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }
}
