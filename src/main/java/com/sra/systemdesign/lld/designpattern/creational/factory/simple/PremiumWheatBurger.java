package com.sra.systemdesign.lld.designpattern.creational.factory.simple;

public class PremiumWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Wheat Burger");
    }
}
