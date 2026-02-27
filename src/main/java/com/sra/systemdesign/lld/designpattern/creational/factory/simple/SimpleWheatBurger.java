package com.sra.systemdesign.lld.designpattern.creational.factory.simple;

public class SimpleWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Simple Wheat Burger");
    }
}
