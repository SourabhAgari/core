package com.sra.core.multithreading.locksandsemaphores.locks.stamped;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    private boolean isAvailable = false;

    public void produce(StampedLock slock){
        long stamp = slock.readLock();
        try {
            isAvailable = true;
            System.out.println("Lock Acquired by thread"+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            slock.unlockRead(stamp);
            System.out.println("Lock released by"+Thread.currentThread().getName());
        }
    }

    public void consume(StampedLock slock){
        long stamp = slock.writeLock();
        try {
            isAvailable = true;
            System.out.println("Lock Acquired by thread for consumption"+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            slock.unlockWrite(stamp);
            System.out.println("Lock released by"+Thread.currentThread().getName());
        }
    }
}
