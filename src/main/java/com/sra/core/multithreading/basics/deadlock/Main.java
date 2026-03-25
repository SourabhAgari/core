package com.sra.core.multithreading.basics.deadlock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        System.out.println("Main thread is running");
        Thread t1 = new Thread(() -> resource.produce(), "Producer Thread t1");
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Producer Thread t2");
        t1.start();
        t2.start();

        try {
            Thread.sleep(1500);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Thread 1 is suspended");
        t1.suspend();
        System.out.println("Main completed its execution");
    }
}
