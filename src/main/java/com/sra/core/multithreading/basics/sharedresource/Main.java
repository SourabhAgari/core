package com.sra.core.multithreading.basics.sharedresource;

public class Main {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        // 1. Fixed the lambda syntax and added try-catch for sleep
        Thread t1 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is sleeping for 5 seconds...");
                Thread.sleep(5000L);
                sr.addItem();
                System.out.println("Item added by " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-1");


        Thread t2 = new Thread(() -> {
            sr.consumeItem();
        }, "Thread-2");
        t1.start();
        t2.start();
    }
}
