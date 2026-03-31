package com.sra.dsa.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertintervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {6, 9}
        };
        int[] newInterval = {2,5};
        System.out.println(Arrays.deepToString(insertintervals.insert(intervals,newInterval)));
    }

    public static int[][] insert(int[][] intervals,int[] newInterval) {
        if(intervals.length <= 1) return intervals;
        int[][] mergeIntervals  = Arrays.copyOf(intervals, intervals.length + 1);
        mergeIntervals[mergeIntervals.length -1] = newInterval;
        Arrays.sort(mergeIntervals,(a, b) -> Integer.compare(a[0],b[0]));

        List<int[]> mergedList = new ArrayList<>();

        int[] currentInterval = mergeIntervals[0];
        mergedList.add(currentInterval);

        for (int[] nextInterval : mergeIntervals){
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];

            if(nextStart <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd,nextEnd);
            }
            else {
                currentInterval = nextInterval;
                mergedList.add(currentInterval);
            }

        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
