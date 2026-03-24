package com.sra.dsa.twopointers.arrays;

import java.util.Arrays;

public class shortestUnsortedContAubArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(calculate(nums));
    }

    private static int calculate(int[] nums) {
        int length = nums.length;
        int left = 0, right = length - 1;
        while(left < length - 1 && nums[left] <= nums[left + 1]) left++;
        if(left == length -1) return 0;
        while (right > 0 && nums[right] >= nums[right - 1]) right--;

        int subArrayMax = Integer.MIN_VALUE;
        int subArrayMin = Integer.MAX_VALUE;
        for(int i = left;i<=right;i++){
            subArrayMax = Math.max(subArrayMax, nums[i]);
            subArrayMin = Math.min(subArrayMin, nums[i]);
        }

        while (left > 0 && nums[left-1] > subArrayMin) left--;
        while (right > length -1 && nums[right + 1] < subArrayMax) right++;
        return right - left + 1;
    }
}
