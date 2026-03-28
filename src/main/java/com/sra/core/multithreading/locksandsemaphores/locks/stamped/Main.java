package com.sra.core.multithreading.locksandsemaphores.locks.stamped;

import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {
        SharedResource shared = new SharedResource();
        StampedLock slock = new StampedLock();
        Thread t1 = new Thread(() -> {
            shared.produce(slock);
        },"Thread 1");

        Thread t2 = new Thread(() -> {
            shared.produce(slock);
        },"Thread 2");

        Thread t3 = new Thread(() -> {
            shared.consume(slock);
        },"Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
