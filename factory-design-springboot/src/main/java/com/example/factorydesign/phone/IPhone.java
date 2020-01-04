package com.example.factorydesign.phone;

public class IPhone implements Phone {
    @Override
    public void showSpec() {
        System.out.println("This is IPhone");
    }
}
