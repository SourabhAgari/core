package com.sra.systemdesign.lld.designpattern.behavioral.strategy.simple;

public class NormalFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Normal flying");
    }
}
