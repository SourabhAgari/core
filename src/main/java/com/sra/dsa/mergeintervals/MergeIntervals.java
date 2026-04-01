package com.sra.dsa.mergeintervals;

import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(MergeIntervals.merge(intervals)));
    }

    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int length = intervals.length;

        List<int[]> mergedIntervals = new java.util.ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for(int[] interval: intervals){
            int currentIntervalEnd = currentInterval[1];
            int nextIntervalStart = interval[0];
            int nextIntervalEnd = interval[1];

            if(nextIntervalStart <= currentIntervalEnd){
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);

    }
}
