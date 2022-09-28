package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianFilledSetTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("author test 1", "title test 1", 2000, "01/a/00"));
        bookSet.add(new Book("author test 2", "title test 2", 2002, "41/b/02"));
        bookSet.add(new Book("author test 3", "title test 3", 2003, "44/c/03"));
        bookSet.add(new Book("author test 4", "title test 4", 2005, "63/d/05"));
        bookSet.add(new Book("author test 5", "title test 5", 2007, "128/e/07"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int yearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2003, yearMedian);
    }

    @Test
    void publicationYearMedianEmptySetTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int yearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(0, yearMedian);
    }
}