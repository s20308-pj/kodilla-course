package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBoook(){
        //Given
        Book book1 = new Book("title one book 1", "author 1", LocalDate.of(1983,1,1));
        Book book2 = new Book("title one book 2", "Janusz 2", LocalDate.of(1984,2,2));
        Book book3 = new Book("title one book 3", "Janusz 3", LocalDate.of(1985,3,3));
        Book book4 = new Book("title one book 4", "Janusz 4", LocalDate.of(1986,4,4));
        Book book5 = new Book("title one book 5", "Janusz 5", LocalDate.of(1987,5,5));
        Book book6 = new Book("title one book 6", "Janusz 6", LocalDate.of(1988,6,6));
        Book book7 = new Book("title one book 7", "Janusz 7", LocalDate.of(1989,7,7));
        Book book8 = new Book("title one book 8", "Janusz 8", LocalDate.of(1980,8,8));

        Library library1 = new Library("library 1");

        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);
        library1.getBooks().add(book4);
        library1.getBooks().add(book5);
        library1.getBooks().add(book6);
        library1.getBooks().add(book7);
        library1.getBooks().add(book8);

        //When
        //Then
        System.out.println(library1);
        Assertions.assertEquals(8, library1.getBooks().size());
    }
}
