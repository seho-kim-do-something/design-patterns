package demo.example.observer;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Subscriber subscriber1 = new Subscriber("Seho");
        Subscriber subscriber2 = new Subscriber("Woonjung");
        Subscriber subscriber3 = new Subscriber("Nara");

        subscriber1.subscribe(channel);
        subscriber2.subscribe(channel);
        subscriber3.subscribe(channel);

        channel.createContent("Cracking coding interview!");

    }
}
