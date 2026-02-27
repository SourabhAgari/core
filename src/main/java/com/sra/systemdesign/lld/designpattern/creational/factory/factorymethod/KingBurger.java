package com.sra.systemdesign.lld.designpattern.creational.factory.factorymethod;

import com.sra.systemdesign.lld.designpattern.creational.factory.simple.BasicBurger;
import com.sra.systemdesign.lld.designpattern.creational.factory.simple.Burger;
import com.sra.systemdesign.lld.designpattern.creational.factory.simple.SimpleWheatBurger;
import com.sra.systemdesign.lld.designpattern.creational.factory.simple.StandardBurger;

public class KingBurger implements BurgerFactory{
    @Override
    public Burger prepareBurger(String type) {
        if(type.equals("basic")) return new BasicBurger();
        else if(type.equals("standard")) return new StandardBurger();
        else if(type.equals("simplewheat")) return new SimpleWheatBurger();
        else throw new IllegalArgumentException("Invalid burger type");
    }
}
