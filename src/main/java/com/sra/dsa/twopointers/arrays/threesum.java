package com.sra.dsa.twopointers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public static void main(String[] args) {
        // Test Case 1: Standard input with duplicates
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Test Case 1: " + threeSumMethod(nums1));
        // Expected Output: [[-1, -1, 2], [-1, 0, 1]]

        // Test Case 2: Array with all zeros
        int[] nums2 = {0, 0, 0, 0};
        System.out.println("Test Case 2: " + threeSumMethod(nums2));
        // Expected Output: [[0, 0, 0]]

        // Test Case 3: No valid triplets
        int[] nums3 = {1, 2, 3};
        System.out.println("Test Case 3: " + threeSumMethod(nums3));
        // Expected Output: []
    }

    private static List<List<Integer>> threeSumMethod(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i< n-2; i++){
            if(i >0 && nums[i] == nums[i-1]) continue;
            int left = i+1, right = n-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicate values for the second element
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicate values for the third element
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if(sum < 0) left++;
                else right--;
            }
        }
        return result;

    }
}
