package com.sra.core.multithreading.basics.monitorlock;

public class Main {
    public static void main(String[] args) {

        System.out.println("Same Object");
        MonitorLockExample example = new MonitorLockExample();
        Thread t1 = new Thread(() -> example.task1(), "Thread-1");
        Thread t2 = new Thread(() -> example.task1(), "Thread-2");

        t1.start();
        t2.start();
        System.out.println("Completed same object");

            System.out.println("Different Object");
            MonitorLockExample example1 = new MonitorLockExample();
            MonitorLockExample example2 = new MonitorLockExample();
            Thread t3 = new Thread(() -> example1.task1(), "Thread-3");
            Thread t4 = new Thread(() -> example2.task1(), "Thread-4");

            t3.start();
            t4.start();
             System.out.println("Completed different object");
    }
}
