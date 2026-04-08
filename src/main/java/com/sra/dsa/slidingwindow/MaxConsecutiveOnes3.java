package com.sra.dsa.slidingwindow;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestConsecutiveOnes(nums, k));
    }

    public static int longestConsecutiveOnes(int[] nums, int k){
        int left = 0, right = 0, maxLength = 0, zeroCount = 0;
        while(right < nums.length) {
            if(nums[right] == 0) {
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            if(zeroCount <= k) {
                int length = right - left + 1;
                maxLength = Math.max(maxLength, length);
            }
            right++;
        }
        return maxLength;
    }
}
