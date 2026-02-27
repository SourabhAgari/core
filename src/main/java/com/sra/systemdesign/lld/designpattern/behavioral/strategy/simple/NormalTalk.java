package com.sra.systemdesign.lld.designpattern.behavioral.strategy.simple;

public class NormalTalk implements Talkable{
    @Override
    public void talk() {
        System.out.println("Normal talking");
    }
}
