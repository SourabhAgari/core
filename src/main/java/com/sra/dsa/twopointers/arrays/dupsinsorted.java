package com.sra.dsa.twopointers.arrays;

import java.util.Arrays;

public class dupsinsorted {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(dupsinsorted.removeDuplicates(nums)));
    }

    private static int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return new int[]{};
        int i = 0, j = i+1;
        while(j < n){
            if(nums[i] == nums[j]) j++;
            else {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return Arrays.copyOfRange(nums, 0, i + 1);
    }

}
