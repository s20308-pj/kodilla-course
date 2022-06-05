package com.kodilla.spring.forum;

import com.kodilla.spring.library.LibraryDbController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {

    private List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    @Autowired
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
        //do nothing
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
