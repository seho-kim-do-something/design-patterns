package com.example.facade;

public class Banking {
    public static void main(String[] args) {
        BankingFacade banking = new BankingFacade("123-4567", "13579");
        if(!banking.isValidUser()) {
            System.out.println("Invalid User");
            return;
        }

        double balance = banking.withdraw(100);
        if(balance < 0) {
            System.out.println("Balance is not enough.");
        } else {
            System.out.println("Current balance: " + balance);
        }
        System.out.println("Current balance: " + banking.deposit(200));
    }
}
