package com.sra.core.multithreading.lockfree;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // using single thread
        /*
        for(int i=0;i<400;i++){
            resource.increment();
        }

        System.out.println(resource.get());
         */

        Thread t1 = new Thread(() -> {
           for(int i=0;i<100000;i++){
               resource.increment();
           }
        },"Thread 1");

        Thread t2 = new Thread(() -> {
            for(int i=0;i<100000;i++){
                resource.increment();
            }
        },"Thread 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(resource.get());
    }
}
