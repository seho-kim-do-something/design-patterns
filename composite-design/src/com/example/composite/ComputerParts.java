package com.example.composite;

import java.util.ArrayList;
import java.util.List;

public class ComputerParts implements Component {
    private String name;
    private List<Component> parts = new ArrayList<>();

    public ComputerParts(String name) {
        this.name = name;
    }

    public void addPart(Component part) {
        parts.add(part);
    }

    @Override
    public void showPrice() {
        System.out.println(name+"->");
        parts.forEach(Component::showPrice);
    }
}
