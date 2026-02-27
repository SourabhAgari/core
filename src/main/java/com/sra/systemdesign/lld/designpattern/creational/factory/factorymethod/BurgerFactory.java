package com.sra.systemdesign.lld.designpattern.creational.factory.factorymethod;

import com.sra.systemdesign.lld.designpattern.creational.factory.simple.Burger;

public interface BurgerFactory {
    Burger prepareBurger(String type);
}
