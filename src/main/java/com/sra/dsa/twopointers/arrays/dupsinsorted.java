package com.sra.dsa.twopointers.arrays;

public class dupsinsorted {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int i = 0, j = i+1;
        while(j < n){
            if(nums[i] == nums[j]) j++;
            else {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

}
