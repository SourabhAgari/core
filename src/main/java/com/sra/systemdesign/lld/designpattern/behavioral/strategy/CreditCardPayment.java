package com.sra.systemdesign.lld.designpattern.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment through credit card of amount "+amount);
    }
}
