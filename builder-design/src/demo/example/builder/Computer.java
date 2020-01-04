package demo.example.builder;

public class Computer {
    private String brand;
    private String cpu;
    private int mem;
    private int storage;
    private int screenSize;

    public Computer(String brand, String cpu, int mem, int storage, int screenSize) {
        this.brand = brand;
        this.cpu = cpu;
        this.mem = mem;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mem=" + mem +
                ", storage=" + storage +
                ", screenSize=" + screenSize +
                '}';
    }
}
