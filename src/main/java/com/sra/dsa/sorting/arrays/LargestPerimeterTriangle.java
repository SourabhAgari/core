package com.sra.dsa.sorting.arrays;

import java.util.Arrays;
import java.util.Collections;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] arr = {1,2,1,10};
        System.out.println(LargestPerimeterTriangle.largestPerimeter(arr));
    }

    private static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int max = 0;
        int i = length-1, j = i-1, k = j-1;
        while(k >= 0){
            if(nums[j] + nums[k] > nums[i]){
                max = Math.max(max, nums[i]+nums[j]+nums[k]);
                i--;
                j--;
                k--;
            } else{
                i--;
                j--;
                k--;
            }
        }
        return max;
    }
}
