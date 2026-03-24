package com.sra.dsa.twopointers.arrays;

import java.util.Arrays;

public class threesumclosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums,1));
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        if (length < 3) return -1;
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i=0;i<length-2;i++){
            int left = i+1, right = length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target) return target;
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }
                if(sum > target) right--;
                else left++;
            }
        }
        return closestSum;
    }
}
