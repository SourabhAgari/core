package com.sra.systemdesign.lld.designpattern.behavioral.strategy.simple;

public class NormalWalk implements Walkable{

    @Override
    public void walk() {
        System.out.println("Normal walking");
    }
}
