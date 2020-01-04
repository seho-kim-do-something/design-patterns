package demo.example.observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subject channel) {
        channel.getAllObservers().add(this);
    }

    @Override
    public void unsubscribe(Subject channel) {
        channel.getAllObservers().remove(this);
    }

    @Override
    public void update(String content) {
        System.out.println("Hey " + name + ", \"" + content + "\" has been updated!");
    }
}
