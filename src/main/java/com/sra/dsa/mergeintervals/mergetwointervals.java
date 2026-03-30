package com.sra.dsa.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class mergetwointervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        System.out.println(Arrays.deepToString(mergetwointervals.merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> mergedList = new ArrayList<>();

        int[] currentInterval = intervals[0];
        mergedList.add(currentInterval);

        for (int[] nextInterval : intervals){
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
