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
}
