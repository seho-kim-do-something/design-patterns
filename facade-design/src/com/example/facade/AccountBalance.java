package com.example.facade;

public class AccountBalance {
    private double balance = 1000;

    public double deposit(double moneyIn) {
        this.balance += moneyIn;
        return balance;
    }

    public double withdraw(double moneyOut) {
        if(this.balance < moneyOut) {
            return -1;
        } else {
            this.balance -= moneyOut;
            return balance;
        }
    }
}
