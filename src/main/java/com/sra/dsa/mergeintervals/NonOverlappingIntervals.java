package com.sra.dsa.mergeintervals;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,100},{11,22},{1,11},{2,12}};
        System.out.println(NonOverlappingIntervals.eraseOverlapIntervals(arr));
    }

    public static int eraseOverlapIntervals(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 0;
        int lastEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < lastEnd){
                count++;
            }
                else lastEnd = intervals[i][1];
        }
        return count;
    }
}
