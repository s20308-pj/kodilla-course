package com.kodilla.patterns2.observer.homework;

public class Homework{
    public final String topic;
    public final String link;


    public Homework(String topic, String link) {
        this.topic = topic;
        this.link = link;

    }

    public String getTopic() {
        return topic;
    }

    public String getLink() {
        return link;
    }
}
