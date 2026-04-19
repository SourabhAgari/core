package com.sra.dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(subArraySumOptimal(arr, k));
    }

    public static int subArraySumBrute(int[] arr, int k){
        int count = 0;
        int length = arr.length;
        for(int i=0;i<length;i++){
            int sum = 0;
            for(int j=i;j<length;j++){
                sum += arr[j];
                if(sum == k) count+=1;
            }
        }
        return count;
    }

    public static int subArraySumOptimal(int[] arr, int k){
        int length = arr.length;
        int prefixSum = 0, count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<length;i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum -k)){
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0) + 1);
        }
        return count;
    }
}
