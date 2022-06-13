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

        Library library = new Library("library 1");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);
        library.getBooks().add(book8);

        //When
        Library shallowCopyOfLibrary = null;
        try {
            shallowCopyOfLibrary = library.shallowCopy();
            shallowCopyOfLibrary.setName("library 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepCopyOfLibrary = null;
        try {
            deepCopyOfLibrary = library.deepCopy();
            deepCopyOfLibrary.setName("library 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        Assertions.assertEquals(7, library.getBooks().size());
        Assertions.assertEquals(7,shallowCopyOfLibrary.getBooks().size());
        Assertions.assertEquals(8,deepCopyOfLibrary.getBooks().size());


    }
}
