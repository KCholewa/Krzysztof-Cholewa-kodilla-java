package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book firstBook = new Book("Jan Kowalski", "tytuł1", 1999,"1111");
        Book secondBook = new Book("Jan Wisniewski", "tytuł2", 2001,"2222");
        Book thirdBook = new Book("Jan Nowak", "tytuł3", 2003,"3333");
        Book fouthBook = new Book("Józef Kowalczyk", "tytuł4", 2005,"4444");
        Book fifthBook = new Book("Adam Miuczyński", "tytuł5", 2007,"5555");

        Set<Book> books = new HashSet<>();
        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(fouthBook);
        books.add(fifthBook);

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2003, median);

    }
}
