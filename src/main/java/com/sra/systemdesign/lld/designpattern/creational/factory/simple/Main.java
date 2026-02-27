package com.sra.systemdesign.lld.designpattern.creational.factory.simple;

public class Main {
    public static void main(String[] args) {
        Burger burger = BurgerFactory.createBurger("basic");
        burger.prepare();
    }
}
