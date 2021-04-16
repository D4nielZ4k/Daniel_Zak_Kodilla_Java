package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @BeforeAll
    static void beforeTest() {

    }

    @Test
    void testGetBooks() {
        Book book1 = new Book("Cialo nie klamie", "Melinek Mudy", LocalDate.of(2019, 9, 4));
        Book book2 = new Book("Ziemia obiecana", "Obama Barack ", LocalDate.of(2021, 3, 17));
        Book book3 = new Book("Precedens", "Mroz Remigiusz ", LocalDate.of(2020, 9, 16));
        Book book4 = new Book("Terapeutka", "Paris B.A.", LocalDate.of(2021, 4, 14));

        Library library = new Library("First");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        System.out.println(library.getBooks());


        //shallowCopy()
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("New Name");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deepCopy()
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deppCopy();
            deepCloneLibrary.setName("new Name");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Assertions.assertEquals(clonedLibrary.getBooks().size(), library.getBooks().size());
        Assertions.assertEquals(deepCloneLibrary.getBooks().size(), library.getBooks().size());
    }
}
