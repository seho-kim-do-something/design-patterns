package demo.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<String> contents = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void createContent(String content) {
        contents.add(content);;
        notifyObservers(content);
    }

    @Override
    public void notifyObservers(String content) {
        subscribers.forEach(ob -> ob.update(content));
    }

    @Override
    public List<Observer> getAllObservers() {
        return subscribers;
    }
}
