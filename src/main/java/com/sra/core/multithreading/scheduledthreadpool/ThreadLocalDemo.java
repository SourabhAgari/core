package com.sra.core.multithreading.scheduledthreadpool;

public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

        threadLocalObj.set(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
            threadLocalObj.set(Thread.currentThread().getName());
            System.out.println("Thread 1: " + threadLocalObj.get());
        },"Thread 1");

        t1.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Main Thread: " + threadLocalObj.get());
    }
}
