package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable{
    private final List<Observer> observers;
    private final List<String> message;
    private final String name;

    public ForumTopic(String name) {
        observers = new ArrayList<>();
        message = new ArrayList<>();
        this.name = name;
    }
    public void addPost(String post) {
        message.add(post);
        notifyObservers();
    }

    @Override
    public void registryObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
