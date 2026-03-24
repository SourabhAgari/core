package com.sra.core.multithreading.basics.monitorlock;

public class MonitorLockExample2 {
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

    public void task2(){
        System.out.println("before synchronised block");
        synchronized (this){
            try {
                System.out.println("Task 2 is starting...");
                System.out.println("Acquired lock by "+ Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("Task 2 is completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void task3(){
        System.out.println("no synchronization");
    }
}
