package com.sra.dsa.twopointers.arrays;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twosum.twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target) return new int[]{left, right};
            else if(sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
}
