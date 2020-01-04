package com.example.facade;

public class BankingFacade {
    private String account;
    private String pass;

    private BankAccount bankAccount;
    private AccountPass accountPass;
    private AccountBalance accountBalance;

    public BankingFacade(String account, String pass) {
        this.account = account;
        this.pass = pass;
        this.bankAccount = new BankAccount();
        this.accountPass = new AccountPass();
        this.accountBalance = new AccountBalance();
    }

    public boolean isValidUser() {
        return bankAccount.isAccountValid(account) && accountPass.isPassValid(pass);
    }

    public double withdraw(double moneyOut) {
        return accountBalance.withdraw(moneyOut);
    }

    public double deposit(double moneyIn) {
        return accountBalance.deposit(moneyIn);
    }

}
