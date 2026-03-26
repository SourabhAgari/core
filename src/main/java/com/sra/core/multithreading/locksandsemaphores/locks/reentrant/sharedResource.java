package com.sra.core.multithreading.locksandsemaphores.locks.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class sharedResource {
    boolean isAvailable = false;
    public void produce(ReentrantLock lock) {
        try {
            lock.lock();
            System.out.println("Lock acquired by producer: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
            System.out.println("Lock released by producer: " + Thread.currentThread().getName());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
