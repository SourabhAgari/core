package com.sra.systemdesign.lld.designpattern.behavioral.strategy.simple;

public class Main {
    public static void main(String[] args) {
        CompanionRobot companionRobot = new CompanionRobot();
        companionRobot.walk();

        DanceRobot danceRobot = new DanceRobot();
        danceRobot.dance();

    }
}
