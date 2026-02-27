package com.sra.systemdesign.lld.designpattern.creational.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new SinghBurger();
        burgerFactory.prepareBurger("premium").prepare();

    }
}
