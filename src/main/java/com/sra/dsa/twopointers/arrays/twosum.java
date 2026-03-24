package com.sra.dsa.twopointers.arrays;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int left = 0, right = length - 1;
        if (length == 0) return new int[]{-1, -1};
        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == target) return new int[]{left,right};
            else if (sum > target) right--;
            else left++;
    }
        return new int[]{-1, -1};
    }
}
