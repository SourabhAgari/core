package com.sra.systemdesign.lld.designpattern.behavioral.strategy.simple;

public class NormalDance implements Dancable{
    @Override
    public void dance() {
        System.out.println("Normal Dance");
    }
}
