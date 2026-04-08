package com.sra.dsa.slidingwindow;

public class longConIncrSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(longestConsecutiveIncreasingSubsequence(nums));
    }

    private static int longestConsecutiveIncreasingSubsequence(int[] nums) {
        int length = nums.length;
        int count = 1, maxCount = 1;
        if(nums.length == 0 || nums == null) return 0;
        for(int i=1;i<length;i++){
            if(nums[i] > nums[i-1]){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else count = 1;
        }
        return maxCount;
    }
}
