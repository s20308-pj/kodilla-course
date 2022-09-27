package com.kodilla.patterns2.observer.homework;

import java.time.LocalDateTime;

public class Mentor implements Observer {

    private final String name;
    private int homeworkToCheck;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(KodillaStudent kodillaStudent) {
        LocalDateTime dateTime = LocalDateTime.now();
        String text = kodillaStudent.getFirstName() + " " +
                kodillaStudent.getLastname() + " " +
                " send homework at: " +
                dateTime;
        System.out.println(text);
        homeworkToCheck++;
    }

    public String getName() {
        return name;
    }

    public int getHomeworkToCheck() {
        return homeworkToCheck;
    }
}
