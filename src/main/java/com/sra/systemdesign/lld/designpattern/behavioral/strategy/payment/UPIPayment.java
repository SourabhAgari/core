package com.sra.systemdesign.lld.designpattern.behavioral.strategy.payment;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment through UPI of amount "+amount);
    }
}
