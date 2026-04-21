package com.sra.dsa.kadanes;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-3, -1, -2, -5};
        System.out.println(maxSubArraySumBrute(nums));
    }

    private static int maxSubArraySumBrute(int[] nums){
        int length = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            int sum = 0;
            for(int j=i;j<length;j++){
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
