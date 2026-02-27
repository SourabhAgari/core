package com.sra.systemdesign.lld.designpattern.creational.factory.simple;

public class BasicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing basic burger");
    }
}
