package com.sra.core.collections.queue;

import java.util.PriorityQueue;

public class MaxPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> Integer.compare(b,a));
        maxPQ.add(5);
        maxPQ.add(3);
        maxPQ.add(1);
        maxPQ.add(6);
        System.out.println(maxPQ);
    }
}
