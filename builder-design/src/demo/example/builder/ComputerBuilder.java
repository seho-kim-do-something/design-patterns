package demo.example.builder;

public class ComputerBuilder {
    private String brand;
    private String cpu;
    private int mem;
    private int storage;
    private int screenSize;

    public ComputerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setMem(int mem) {
        this.mem = mem;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Computer getComputer() {
        return new Computer(brand, cpu, mem, storage, screenSize);
    }
}
