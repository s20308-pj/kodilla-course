package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private int numberOdPublishedPosts;

    public ForumUser(final int id, final String username, final char sex, final LocalDate dateOfBirth, int numberOdPublishedPosts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOdPublishedPosts = numberOdPublishedPosts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOdPublishedPosts() {
        return numberOdPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOdPublishedPosts=" + numberOdPublishedPosts +
                '}';
    }
}
