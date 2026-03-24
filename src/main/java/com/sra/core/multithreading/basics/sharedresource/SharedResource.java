package com.sra.core.multithreading.basics.sharedresource;

public class SharedResource {
    private boolean isAvailable = false;

    public synchronized void addItem() {
        isAvailable = true;
        System.out.println("Item added by Thread: " + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Consume item invoked by thread : " + Thread.currentThread().getName());
        while (!isAvailable){
            try {
                System.out.println("Item not available, waiting... Thread: " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Item consumed by Thread: " + Thread.currentThread().getName());
        isAvailable = false;
    }

}
