package com.sra.core.collections.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeues {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        deque.addLast(78);
        deque.addLast(98);
        System.out.println(deque);

        deque.addFirst(9);
        System.out.println(deque);


        deque.removeFirst();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        System.out.println("peek first");
        System.out.println(deque.peekFirst());

        System.out.println("peek last");
        System.out.println(deque.peekLast());

        deque.removeLast();
        deque.removeLast();

        System.out.println("peek last");
        System.out.println(deque.peekLast());
    }
}
