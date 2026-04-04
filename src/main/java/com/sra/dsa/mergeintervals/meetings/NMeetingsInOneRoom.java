package com.sra.dsa.mergeintervals.meetings;

import java.util.ArrayList;
import java.util.List;

public class NMeetingsInOneRoom {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        System.out.println(NMeetingsInOneRoom.maxMeetings(start, end));
    }

    public static int maxMeetings(int[] start, int[] end) {
        List<Meeting> meetings = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            meetings.add(new Meeting(start[i], end[i], i+1));
        }

        meetings.sort((a,b) -> Integer.compare(a.end,b.end));
        int count = 1;
        int lastEnd = meetings.get(0).end;
        for(int i=1;i<meetings.size();i++){
            if(meetings.get(i).start >= lastEnd){
                count++;
                lastEnd = meetings.get(i).end;
            }
        }
        return count;
    }
}
