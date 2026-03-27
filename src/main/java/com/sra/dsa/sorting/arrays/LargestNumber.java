package com.sra.dsa.sorting.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(LargestNumber.largestNumber(nums));
    }

    private static String largestNumber(int[] nums){
        int n = nums.length;
        String[] str = new String[n];
        for (int i=0;i<n;i++){
            str[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(str, (o1,o2) -> {
            String first = o1+o2;
            String second = o2+o1;
            return o2.compareTo(o1);
        });
        System.out.println(Arrays.toString(str));
        if(str[0].equals("0")) return "0";
        String s = "";
        for(String res: str){
            s+=res;
        }
        return s;
    }
}


