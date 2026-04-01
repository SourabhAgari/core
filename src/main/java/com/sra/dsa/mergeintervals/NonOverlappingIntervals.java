package com.sra.dsa.mergeintervals;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3}};
        System.out.println(nonOverlappingIntervals(intervals));
    }

    private static int nonOverlappingIntervals(int[][] intervals) {
        int length = intervals.length;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));

        int count = 0;
        int lastFreeTime = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < lastFreeTime){
                count++;
            } else {
                lastFreeTime = intervals[i][1];
            }
        }
        return count;

    }
}
