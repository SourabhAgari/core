package com.sra.core.multithreading.basics;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThreadingLearning());
        Thread t2 = new Thread(new MultiThreadingLearning());

        t1.start();
        t2.start();
        System.out.println("Code is running in thread: " + Thread.currentThread().getName());
    }
}
