package com.example.facade;

public class BankAccount {
    private String account = "123-4567";

    public boolean isAccountValid(String account) {
        return this.account.equals(account);
    }
}