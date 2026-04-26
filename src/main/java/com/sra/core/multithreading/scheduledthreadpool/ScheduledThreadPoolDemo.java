package com.sra.core.multithreading.scheduledthreadpool;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService pool =
                new ScheduledThreadPoolExecutor(3);

        pool.schedule(() -> {
            System.out.println("Task 1 executed after 10 seconds");
        }, 10, java.util.concurrent.TimeUnit.SECONDS);

        pool.shutdown();

    }
}
