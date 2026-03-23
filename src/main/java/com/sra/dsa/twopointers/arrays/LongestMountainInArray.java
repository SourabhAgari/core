package com.sra.dsa.twopointers.arrays;

import javax.imageio.ImageTranscoder;

public class LongestMountainInArray {
    public static void main(String[] args) {
        System.out.println(LongestMountainInArray.LongestMountain(new int[]{2,2,2}));
    }

    private static int LongestMountain(int[] nums){
        int n = nums.length;
        if(n < 3) return 0;
        int longest = 0;
        for(int i=1;i<n-2;i++){

            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                int left = i-1;
                while (left > 0 && nums[left] > nums[left-1]) left--;
                int right = i+1;
                while (right < n-1 && nums[right] > nums[right+1]) right++;
                longest = Math.max(longest, right - left + 1);

                i = right;
            }
        }
        return longest;
    }
}
