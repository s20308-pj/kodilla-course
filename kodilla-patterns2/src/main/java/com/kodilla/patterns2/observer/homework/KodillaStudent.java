package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaStudent implements Observable{
    private final String firstName;
    private final String lastname;
    private final List<Homework> homeworkList;
    private final List<Observer> observers;

    public KodillaStudent(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
        homeworkList = new ArrayList<>();
        observers = new ArrayList<>();
    }

    @Override
    public void addMentor(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addHomework(Homework homework){
        homeworkList.add(homework);
        notifyObserver();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }


}
