package com.sra.core.multithreading.basics.monitorlock;

public class Main2 {
    public static void main(String[] args) {
//        MonitorLockExample2 mex2 = new MonitorLockExample2();
//        Thread t1= new Thread(()-> mex2.task1(), "Thread-1");
//        Thread t2= new Thread(()-> mex2.task2(), "Thread-2");
//        Thread t3= new Thread(()-> mex2.task3(), "Thread-3");
//
//        t1.start();
//        t2.start();
//        t3.start();

        MonitorLockExample2 mex3 = new MonitorLockExample2();
        Thread t4= new Thread(()-> mex3.task1(), "Thread-4");

        MonitorLockExample2 mex4 = new MonitorLockExample2();
        Thread t5= new Thread(()-> mex4.task2(), "Thread-5");

        MonitorLockExample2 mex5 = new MonitorLockExample2();
        Thread t6= new Thread(()-> {
            try {
                mex5.task3();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-6");

        t4.start();
        t5.start();
        t6.start();
    }
}
