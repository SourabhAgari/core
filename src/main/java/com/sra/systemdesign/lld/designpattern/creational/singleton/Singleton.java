package com.sra.systemdesign.lld.designpattern.creational.singleton;

/**
public class Singleton {
    private static volatile Singleton instance;
    private Singleton() {
        System.out.println("Object created");
    }

    public static synchronized Singleton getInstance() {

        if(instance == null) {
            synchronized (Singleton.class){
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
*/
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
/**
 * let's say at the instance is null and at the same time the multiple threads are trying to create the instance
 * for both the threads instance is null, and it will create instance
 * so 2 instance is created
 * to avoid this we use
 * Thread Safety by using synchronized keyword
 * Issue with the thread lock at class level is Toll Booth Effect
 * 100 threads has to wait in queue for the same object
 * in double-checked locking we filter the instance and then we apply the lock
 * effective method to achhieve this is using eager initilisation
 * multithreading is automatically handled by jvm itself
 */
