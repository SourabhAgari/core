package com.sra.core.multithreading.futuresandcallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Callable {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                1,1,1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        Future<List<Integer>> futureObj = tpe.submit(() -> {
            List<Integer> op = new ArrayList<>(List.of(1,2,3,4,5));
            op.add(65);
            return op;
        });

        try {
            List<Integer> res = futureObj.get();
            System.out.println(res);
        } catch (ExecutionException | InterruptedException e){
            System.out.println(e.getMessage());
        }

        tpe.shutdown();


    }
}
