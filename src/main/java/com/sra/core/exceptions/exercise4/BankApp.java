package com.sra.core.exceptions.exercise4;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John", 1000);
        try {
            account.deposit(500);
            account.withdraw(2000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
