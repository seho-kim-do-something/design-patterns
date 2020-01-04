package demo.example.observer;

import java.util.List;

public interface Subject {
    void createContent(String content);

    void notifyObservers(String content);

    List<Observer> getAllObservers();
}
