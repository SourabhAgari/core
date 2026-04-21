package com.sra.dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArrayDivByK {
    public static void main(String[] args) {
        int[] nums = {5};
        int k = 9;
        System.out.println(subArrayDivByK(nums,k));
    }

    public static int subArrayDivByK(int[] nums, int k){
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0 , count = 0;
        map.put(0,1);
        for(int num : nums){
            prefixSum += num;
            int mod = (prefixSum % k + k) % k;
            if(map.containsKey(mod)){
                count += map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod,0) + 1);
        }
        return count;
    }
}
