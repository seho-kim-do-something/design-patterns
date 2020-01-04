package com.example.facade;

public class AccountPass {
    private String pass = "13579";

    public boolean isPassValid(String pass) {
        return this.pass.equals(pass);
    }
}