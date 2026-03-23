package com.sra.dsa.twopointers.arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
    }

    private static int[] swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }

    private static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;
        while (mid <= high){
            if(nums[mid] == 0){
                swap(nums,low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 1) mid++;
            else {
                swap(nums, mid, high);
                high--;
            }
        }
        System.out.println("Sorted Array: "+ Arrays.toString(nums));
    }
}
