package com.sra.dsa.prefixsum;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndexBrute(nums));
    }

    private static int pivotIndexBrute(int[] nums){
        int length = nums.length;
        for(int i=0;i<length;i++){
            int leftSum = 0;
            for(int j=0;j<i;j++){
                leftSum += nums[j];
            }
            int rightSum = 0;
            for(int k=i+1;k<length;k++){
                rightSum += nums[k];
            }
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}
