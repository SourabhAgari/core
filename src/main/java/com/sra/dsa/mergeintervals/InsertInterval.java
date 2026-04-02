package com.sra.dsa.mergeintervals;

import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        System.out.println(Arrays.deepToString(InsertInterval.insert(intervals,newInterval)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int start = 0;
        List<int[]> result = new java.util.ArrayList<>();
        int length = intervals.length;
        while (start < length && newInterval[0] > intervals[start][1]) {
            result.add(intervals[start]);
            start++;
        }

        while (start < length && intervals[start][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[start][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[start][1]);
            start++;
        }
        result.add(newInterval);

        while (start < length){
            result.add(intervals[start]);
            start++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
