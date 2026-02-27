package com.sra.systemdesign.lld.designpattern.creational.factory.simple;

public class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing premium burger");
    }
}
