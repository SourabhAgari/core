package com.sra.dsa.sorting.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDifference {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println(MinAbsDifference.minimumAbsDifference(arr).toString());
    }

    private static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int tempDif = arr[i+1] - arr[i];
            if(tempDif < minDifference) {
                res.clear();
                minDifference = tempDif;
                res.add(List.of(arr[i], arr[i+1]));
            } else if (tempDif == minDifference) {
                res.add(List.of(arr[i], arr[i+1]));
            }
        }
        return res;
    }
}
