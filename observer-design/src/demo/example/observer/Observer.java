package demo.example.observer;

public interface Observer {
    void subscribe(Subject channel);

    void unsubscribe(Subject channel);

    void update(String content);
}
