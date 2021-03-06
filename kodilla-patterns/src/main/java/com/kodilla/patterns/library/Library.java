package com.kodilla.patterns.library;

import com.kodilla.patterns.prototype.Board;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {
    private String name;

    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book book : books){
            cloneLibrary.getBooks().add(book);
        }
        return cloneLibrary;
    }

    @Override
    public String toString() {
        return "Library:" +
                "name: " + name + '\'' +
                ", books:" + books;
    }
}