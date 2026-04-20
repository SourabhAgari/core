package com.sra.dsa.prefixsum;

public class maximumProdSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,0,-1};
        System.out.println(maxProduct(nums));
    }

    private static int maxProduct(int[] nums){
        int maxProd = Integer.MIN_VALUE;
        int length = nums.length;
        for(int i=0;i<length;i++){
            int prod = 1;
            for(int j=i;j<length;j++){
                prod *= nums[j];
                maxProd = Math.max(maxProd, prod);
            }
        }
        return maxProd;
    }

    private static int maxProductOptimal(int[] nums){
        int leftSum = 1, rightSum = 1;
        int maxProd = nums[0];
        for(int i=0;i<nums.length;i++){
            leftSum = leftSum ==0 ? 1 : leftSum;
            rightSum = rightSum == 0 ? 1 : rightSum;
            leftSum *= nums[i];
            rightSum *= nums[nums.length - 1 - i];
            maxProd = Math.max(maxProd, Math.max(leftSum, rightSum));
        }
        return maxProd;
    }
}
