package com.sra.dsa.slidingwindow;

public class minSizeSubArraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSizeSubArraySum(target, nums));
    }

    private static int minSizeSubArraySum(int target, int[] nums){
        int length = nums.length;
        int left = 0, sum =0, minLength = Integer.MAX_VALUE;
        for(int right = 0; right < length; right++) {
            sum += nums[right];
            while (sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
