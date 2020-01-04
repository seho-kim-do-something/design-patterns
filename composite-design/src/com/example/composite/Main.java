package com.example.composite;

public class Main {
    public static void main(String[] args) {
        ComputerParts motherboard = new ComputerParts("mother board");
        Component memory = new ComputerPart("memory", 12.32);
        Component cpu = new ComputerPart("cpu", 120.23);
        Component ram = new ComputerPart("ram", 98.77);
        motherboard.addPart(memory);
        motherboard.addPart(cpu);
        motherboard.addPart(ram);

        ComputerParts peripheral = new ComputerParts("peripheral");
        Component mouse = new ComputerPart("mouse", 43.19);
        Component keyboard = new ComputerPart("keyboard", 99.99);
        Component monitor = new ComputerPart("monitor", 99.99);
        peripheral.addPart(mouse);
        peripheral.addPart(keyboard);
        peripheral.addPart(monitor);

        Component hd = new ComputerPart("HD", 430.99);
        Component coolerFan = new ComputerPart("cooler fan", 430.99);

        ComputerParts cabinet = new ComputerParts("cabinet");
        cabinet.addPart(hd);
        cabinet.addPart(coolerFan);
        cabinet.addPart(motherboard);

        ComputerParts computer = new ComputerParts("computer");
        computer.addPart(cabinet);
        computer.addPart(peripheral);

        cpu.showPrice();
        System.out.println("----------------------");
        motherboard.showPrice();
        System.out.println("----------------------");
        cabinet.showPrice();
        System.out.println("----------------------");
        computer.showPrice();
    }
}
