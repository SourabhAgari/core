package com.sra.core.multithreading.completablefuture;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Completable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                3,4,1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("task1 started");
                sleep(2000);
                return "Task 1 completed";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },tpe);

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("task2 started");
                sleep(2000);
                return "Task 2 completed";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },tpe);

        CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("task3 started");
                sleep(2000);
                return "Task 3 completed";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },tpe);

        System.out.println(task1.get());
        System.out.println(task2.get());
        System.out.println(task3.get());

        CompletableFuture<String> task1Uppercase = task1.thenApply(s -> s.toUpperCase());
        System.out.println(task1Uppercase.get());

        CompletableFuture<String> tas2Uppercase = task2.thenApplyAsync(s -> s.toUpperCase(),tpe);
        System.out.println(tas2Uppercase.get());

        tpe.shutdown();
    }
}
