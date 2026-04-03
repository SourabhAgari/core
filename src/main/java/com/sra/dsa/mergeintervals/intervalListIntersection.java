package com.sra.dsa.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intervalListIntersection {
    public static void main(String[] args) {

    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int top = 0, bottom = 0;
        List<int[]> result = new ArrayList<>();
        int firstLength = firstList.length, secondLength = secondList.length;
        while(top < firstLength && bottom < secondLength){
            int start = Math.max(firstList[top][0],secondList[bottom][0]);
            int end = Math.min(firstList[top][1],secondList[bottom][1]);

            if(start <= end){
                result.add(new int[]{start,end});
            }

            if(firstList[top][1] < secondList[bottom][1]){
                top++;
            } else {
                bottom++;
            }
        }
        return result.toArray(result.toArray(new int[result.size()][]));

    }
}
