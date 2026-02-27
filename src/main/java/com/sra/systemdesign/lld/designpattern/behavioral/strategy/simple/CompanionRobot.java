package com.sra.systemdesign.lld.designpattern.behavioral.strategy.simple;

public class CompanionRobot extends Robot {
    public CompanionRobot() {
        addCapability(Walkable.class, new NormalWalk());
        addCapability(Flyable.class, new NormalFly());
    }

    public void walk(){
        getCapability(Walkable.class).walk();
    }

    public void fly(){
        getCapability(Flyable.class).fly();
    }

    public void talk(){
        getCapability(Talkable.class).talk();
    }
}