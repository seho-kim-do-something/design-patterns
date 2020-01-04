package demo.example.builder;

public class Shop {

    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        Computer computer = builder.setBrand("Lenovo").setCpu("i5").setMem(8).getComputer();
        System.out.println(computer);

        ComputerBuilder builder2 = new ComputerBuilder();
        Computer computer2 = builder2.setCpu("i7").setMem(16).getComputer();
        System.out.println(computer2);
    }
}
