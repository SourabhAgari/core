package com.sra.systemdesign.lld.designpattern.creational.factory.simple;

public class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing standard burger");
    }
}
