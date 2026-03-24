package com.sra.core.multithreading.basics.creation.interfaces;

public class MultiThreadingLearning implements Runnable{

    @Override
    public void run() {
        System.out.println("Code is running in thread: " + Thread.currentThread().getName());
    }
}
