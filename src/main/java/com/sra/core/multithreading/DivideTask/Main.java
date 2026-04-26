package com.sra.core.multithreading.DivideTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> result = pool.submit(new ComputeSumTask(1,100));
        try {
            System.out.println(result.get());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
