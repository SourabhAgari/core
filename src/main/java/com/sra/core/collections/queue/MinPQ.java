package com.sra.core.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinPQ {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(1);
        queue.add(6);

        System.out.println(queue);

        // always when we add or remove elements heapify operation is performed which is O(log n)
    }
}
