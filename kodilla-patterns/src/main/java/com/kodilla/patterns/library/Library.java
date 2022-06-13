package com.kodilla.patterns.library;

import java.util.HashSet;
import java.util.Set;

public final class Library {
    @Override
    public String toString() {
        return "Library:" +
                "name: " + name + '\'' +
                ", books:" + books;
    }

    private final String name;
    private final Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
}