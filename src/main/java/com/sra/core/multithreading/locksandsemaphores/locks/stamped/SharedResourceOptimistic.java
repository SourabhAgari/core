package com.sra.core.multithreading.locksandsemaphores.locks.stamped;

import java.util.concurrent.locks.StampedLock;

public class SharedResourceOptimistic {
        int a = 10;

        public void produce(StampedLock lock){
            long stamp = lock.tryOptimisticRead();
            try {
                System.out.println("Taken optimistic lock");
                a += 1;
                Thread.sleep(8000);
                if(lock.validate(stamp)) {
                    System.out.println("validated and updated");
                } else {
                    System.out.println("lock released");
                    a -= 1;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
}
