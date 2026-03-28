package com.sra.core.multithreading.locksandsemaphores.locks.semaohores;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private boolean isAvailable = false;

    public void produce(Semaphore lock){
        try {
            lock.acquire();
            isAvailable = false;
            System.out.println("Lock Acquired by Thread:"+Thread.currentThread().getName());
            Thread.sleep(8000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            lock.release();
            System.out.println("Lock released by thread"+Thread.currentThread().getName());
        }
    }
}
