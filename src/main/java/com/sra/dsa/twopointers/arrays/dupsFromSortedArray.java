package com.sra.dsa.twopointers.arrays;

public class dupsFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(afterDuplicatesRemoval(nums));
    }
    private static int afterDuplicatesRemoval(int[] nums){
        int length = nums.length;
        int left = 0, right = 1;
        while (right < length){
            if(nums[left] == nums[right]) {
                right++;
            } else {
                left++;
                nums[left] = nums[right];
            }
        }
        return left+1;
    }
}
