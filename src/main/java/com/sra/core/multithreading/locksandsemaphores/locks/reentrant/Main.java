package com.sra.core.multithreading.locksandsemaphores.locks.reentrant;


import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        sharedResource s = new sharedResource();
        sharedResource s2 = new sharedResource();

        Thread t1 = new Thread(() -> s.produce(lock), "Producer Thread t1");
        Thread t2 = new Thread(() -> s2.produce(lock), "Consumer Thread t2");

        t1.start();
        t2.start();

    }
}
