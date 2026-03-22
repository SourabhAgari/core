package com.sra.dsa.twopointers.arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {

    }

    private int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closestSum = Integer.MAX_VALUE;
        for (int i=0;i< n-2;i++){
            int left = i+1, right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target) return sum;
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }
                if(sum < target) left++;
                else right--;
            }
        }
        return closestSum;
    }
}
