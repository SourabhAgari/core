package com.sra.systemdesign.lld.designpattern.creational.factory.simple;

public class BurgerFactory {
    public static Burger createBurger(String type) {
        if (type.equals("basic")) {
            return new BasicBurger();
        } else if (type.equals("standard")) {
            return new StandardBurger();
        } else if (type.equals("premium")) {
            return new PremiumBurger();
        } else {
            throw new IllegalArgumentException("Invalid burger type");
        }
    }
}
