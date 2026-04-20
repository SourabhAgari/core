package com.sra.core.multithreading.threadpoolexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                2, // core pool size
                4, // maximum pool size
                10, // keep-alive time for idle threads
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),
                new CustomRejectHandler() // Rejection policy
        );

        for(int i=0;i<9;i++) {
            int finalI = i;
            tpe.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task" + finalI + " processed by " + Thread.currentThread().getName());
            });
        }

        tpe.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory {
    private final AtomicInteger counter = new AtomicInteger(1);

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r, "CustomThread-" + counter.getAndIncrement());
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}

class CustomRejectHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task " + r.toString() + " rejected from " + executor.toString());
    }
}
