package com.sra.systemdesign.lld.designpattern.creational.singleton;

public class Driver {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}

