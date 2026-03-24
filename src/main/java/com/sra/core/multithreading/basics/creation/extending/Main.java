package com.sra.core.multithreading.basics.creation.extending;

import com.sra.core.multithreading.basics.creation.interfaces.MultiThreadingLearning;

public class Main {
    public static void main(String[] args) {
        MultithreadingExample thread1 = new MultithreadingExample();
        MultithreadingExample thread2 = new MultithreadingExample();

        thread1.start();
        thread2.start();

        System.out.println("Finished executing the thread main");
    }
}
