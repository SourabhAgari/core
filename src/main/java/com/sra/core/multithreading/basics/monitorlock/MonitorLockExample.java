package com.sra.core.multithreading.basics.monitorlock;

public class MonitorLockExample {

    public synchronized void task1(){
        try {
            System.out.println("Task 1 is starting...");
            System.out.println("Acquired lock by "+ Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("Task 1 is completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
