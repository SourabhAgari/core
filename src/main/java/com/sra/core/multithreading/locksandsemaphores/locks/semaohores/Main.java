package com.sra.core.multithreading.locksandsemaphores.locks.semaohores;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sm = new Semaphore(2);
        SharedResource sr = new SharedResource();

        Thread t1 = new Thread(() -> {
            sr.produce(sm);
        },"Thread 1");

        Thread t2 = new Thread(() -> {
            sr.produce(sm);
        },"Thread 2");

        Thread t3 = new Thread(() -> {
            sr.produce(sm);
        },"Thread 3");

        Thread t4 = new Thread(() -> {
            sr.produce(sm);
        },"Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
