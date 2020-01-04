package com.example.composite;

public class ComputerPart implements Component {
    private String name;
    private double price;

    public ComputerPart(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + ": $" + price);
    }
}
