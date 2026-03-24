package com.sra.dsa.twopointers.arrays;

import java.util.Arrays;
import java.util.List;

public class threesum {
    public static void main(String[] args) {

    }

    private static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        int length = nums.length;
        if (length < 3) return List.of();
        List<List<Integer>> result = new java.util.ArrayList<>();
        for(int i=0;i<length-2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1, right = length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                else if (sum > 0) right--;
                else left++;
            }
        }
        return result;
    }
}
