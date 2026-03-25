package com.sra.core.multithreading.basics.creation.join;

import com.sra.core.multithreading.basics.deadlock.SharedResource;

public class Joins {
    public static void main(String[] args) {
        System.out.println("Main thread started and running");
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 is created");
            sharedResource.produce();
        },"Thread 1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread is completed");
    }
}
