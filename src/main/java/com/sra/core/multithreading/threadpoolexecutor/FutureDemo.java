package com.sra.core.multithreading.threadpoolexecutor;

import java.sql.Time;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy()
        );


        Future<?> futureObj = tpe.submit(() -> {
            try {
                Thread.sleep(7000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        });

        System.out.println("is thread execution done?"+futureObj.isDone());
        try {
            futureObj.get(2, TimeUnit.SECONDS);
        } catch (TimeoutException e){
            System.out.println(e.getMessage());
        } catch (ExecutionException | InterruptedException e){
            System.out.println(e.getMessage());
        }

        try {
            futureObj.get();
        } catch (ExecutionException | InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("is thread execution done?"+futureObj.isDone());
        System.out.println("is thread execution cancelled?"+futureObj.isCancelled());
    }

}
