package com.sra.core.exceptions.exercise4;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if(amount < 0) throw new InvalidAmountException("Amount cannot be negative or zero");
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if(amount < 0) throw new InvalidAmountException("Amount cannot be negative or zero");
        if(amount > balance) throw new InsufficientFundsException("Insufficient funds");
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }
}
