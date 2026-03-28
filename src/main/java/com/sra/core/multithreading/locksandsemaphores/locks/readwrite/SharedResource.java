package com.sra.core.multithreading.locksandsemaphores.locks.readwrite;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    private boolean isAvailable = false;

    public void produce(ReadWriteLock rwl){
        try {
            rwl.readLock().lock();
            System.out.println("Read Lock Acquired By Thread"+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            rwl.readLock().unlock();
            System.out.println("Read lock released by thread"+Thread.currentThread().getName());
        }
    }

    public void consume(ReadWriteLock rwl){
        try {
            rwl.writeLock().lock();
            System.out.println("Write lock acquired by Thread"+Thread.currentThread().getName());
            Thread.sleep(8000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            rwl.writeLock().unlock();
            System.out.println("Write lock released by thread"+Thread.currentThread().getName());
        }
    }
}
