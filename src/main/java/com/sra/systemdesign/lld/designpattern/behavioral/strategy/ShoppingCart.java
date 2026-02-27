package com.sra.systemdesign.lld.designpattern.behavioral.strategy;

public class ShoppingCart {
    private final PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount){
        paymentStrategy.makePayment(amount);
    }
}
