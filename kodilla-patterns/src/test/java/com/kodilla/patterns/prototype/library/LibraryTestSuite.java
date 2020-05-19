package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //given
        Library booksList = new Library("book");
        Book book1 = new Book("Title 1", "Author 1", LocalDate.now().minusYears(1));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.now().minusYears(2));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.now().minusYears(3));
        Book book4 = new Book("Title 4", "Author 4", LocalDate.now().minusYears(4));
        Book book5 = new Book("Title 5", "Author 5", LocalDate.now().minusYears(5));

        booksList.getBooks().add(book1);
        booksList.getBooks().add(book2);
        booksList.getBooks().add(book3);
        booksList.getBooks().add(book4);
        booksList.getBooks().add(book5);

        Library clonedBoard = null;
        try {
            clonedBoard = booksList.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedBoard = null;
        try {
            deepClonedBoard = booksList.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        booksList.getBooks().remove(book1);

        //Then
        System.out.println(booksList);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);

        Assert.assertEquals(4, booksList.getBooks().size());
        Assert.assertEquals(4, clonedBoard.getBooks().size());
        Assert.assertEquals(5, deepClonedBoard.getBooks().size());

    }
}
