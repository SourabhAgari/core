package com.sra.core.multithreading.locksandsemaphores.locks.readwrite;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ReadWriteLock rwl = new ReentrantReadWriteLock();

        Thread th1 = new Thread(() -> {
            sharedResource.produce(rwl);
        });

        Thread th2 = new Thread(() -> {
            sharedResource.produce(rwl);
        });

        Thread th3 = new Thread(() -> {
            sharedResource.consume(rwl);
        });

        th1.start();
        th2.start();
        th3.start();

    }
}
