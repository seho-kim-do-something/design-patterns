package com.example.factorydesign.phone;

public class AndroidPhone implements Phone {
    @Override
    public void showSpec() {
        System.out.println("This is Android Phone");
    }
}
