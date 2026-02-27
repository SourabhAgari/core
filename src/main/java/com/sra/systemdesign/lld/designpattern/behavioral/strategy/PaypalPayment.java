package com.sra.systemdesign.lld.designpattern.behavioral.strategy;

public class PaypalPayment implements PaymentStrategy{

    @Override
    public void makePayment(double payment) {
        System.out.println("Making payment through paypal of rupees "+payment);
    }
}
