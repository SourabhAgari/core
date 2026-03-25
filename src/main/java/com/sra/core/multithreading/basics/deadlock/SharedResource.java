package com.sra.core.multithreading.basics.deadlock;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Lock acquired by producer: " + Thread.currentThread().getName());
        isAvailable = true;
        try {
            Thread.sleep(8000);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Lock released by producer: " + Thread.currentThread().getName());
    }
}
