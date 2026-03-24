package com.sra.core.multithreading.basics.monitorlock;

public class Main2 {
    public static void main(String[] args) {
        MonitorLockExample2 mex2 = new MonitorLockExample2();
        Thread t1= new Thread(()-> mex2.task1(), "Thread-1");
        Thread t2= new Thread(()-> mex2.task2(), "Thread-2");
        Thread t3= new Thread(()-> mex2.task3(), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
