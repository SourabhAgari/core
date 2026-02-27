package com.sra.systemdesign.lld.designpattern.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart s1 = new ShoppingCart(new PaypalPayment());
        s1.checkOut(2000);
    }
}
