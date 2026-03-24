package com.sra.core.multithreading.basics.creation.extending;

public class MultithreadingExample extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
