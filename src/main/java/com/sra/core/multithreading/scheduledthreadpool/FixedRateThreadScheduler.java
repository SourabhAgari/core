package com.sra.core.multithreading.scheduledthreadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class FixedRateThreadScheduler {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        Future<?> futureObj = scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Task 1 executed at: " + System.currentTimeMillis());
        }, 0, 2, java.util.concurrent.TimeUnit.SECONDS);


        try {
            Thread.sleep(10000);
            futureObj.cancel(true);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(futureObj.get());
        } catch (Exception e) {
            System.out.println("Task was cancelled: " + e.getMessage());
        } finally {
            scheduler.shutdown();
        }

    }
}
