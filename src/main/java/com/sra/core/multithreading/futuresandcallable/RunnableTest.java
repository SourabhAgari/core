package com.sra.core.multithreading.futuresandcallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RunnableTest {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                1,1,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        List<Integer> output = new ArrayList<>();
        output.add(100);
        output.add(300);
        Future<List<Integer>> futureObj = tpe.submit(new MyRunnable(output),output);

        try {
            List<Integer> result = futureObj.get();
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            tpe.shutdown();
        }
    }
}
