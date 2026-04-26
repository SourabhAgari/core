package com.sra.core.multithreading.scheduledthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskSubAfterShutDown {
    public static void main(String[] args)  {
        ExecutorService poolObj = Executors.newFixedThreadPool(2);
        poolObj.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("thread going to start its work");
        });

        poolObj.shutdown();

        try {
            boolean isTerminated = poolObj.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("is terminated?"+isTerminated);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        poolObj.submit(() -> {
            System.out.println("new thread going to start its work after shutdown");
        });
    }
}
