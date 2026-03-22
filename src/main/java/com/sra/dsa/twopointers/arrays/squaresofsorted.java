package com.sra.dsa.twopointers.arrays;

public class squaresofsorted {
    public static void main(String[] args) {

    }

    private static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n-1;
        for(int i = n-1; i>=0;i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
