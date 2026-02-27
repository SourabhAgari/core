package com.sra.systemdesign.lld.designpattern.behavioral.strategy.simple;

public class DanceRobot extends Robot{
    public DanceRobot(){
        addCapability(Dancable.class, new NormalDance());
    }

    public void dance(){
        getCapability(Dancable.class).dance();
    }
}
