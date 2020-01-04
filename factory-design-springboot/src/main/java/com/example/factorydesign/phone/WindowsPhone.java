package com.example.factorydesign.phone;

public class WindowsPhone implements Phone {
    @Override
    public void showSpec() {
        System.out.println("This is Windows Phone");
    }
}
