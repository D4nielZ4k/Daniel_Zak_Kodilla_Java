package com.kodilla.testing.library;

import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Nested
    @DisplayName("Test Of Library")
    class testOfLibrary{
    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //when
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                .thenReturn(resultListOf15Books);                                             // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                .thenReturn(resultListOf0Books);                                              // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                .thenReturn(resultListOf40Books);                                             // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                         // [14]
        assertEquals(15, theListOfBooks15.size());                                       // [15]
        assertEquals(0, theListOfBooks40.size());                                        // [16]
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    }


    @Nested
    @DisplayName("Test Of Library User")
    class testOfUser{
        @Test
        public void test_list_books_in_hands_of_zero_books(){
            //Given
            libraryDatabaseMock = mock(LibraryDatabase.class);
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book>listOfZeroBooks = new ArrayList<>();
            when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(listOfZeroBooks);
            //When
            List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(any());
            //Then
            assertEquals(0, resultListBooksInHandsOf.size());
            verify(libraryDatabaseMock,never()).listBooksInHandsOf(any(LibraryUser.class));
        }
    @Test
    void library_user_has_one_book_borrowed(){
        //Given
        libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book>listOfOneBook  = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(listOfOneBook);
        //when
        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(any());
        //then
        Assertions.assertEquals(1,resultListBooksInHandsOf.size());
        verify(libraryDatabaseMock,times(1)).listBooksInHandsOf(any());
    }
    @Test
    void library_user_has_five_books_borrowed(){
        //Given
        libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book>listOfFiveBooks  = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(listOfFiveBooks);
        //When
        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(any());
        //Then
        Assertions.assertEquals(5,resultListBooksInHandsOf.size());
        System.out.println(resultListBooksInHandsOf);


    }
}

    private  List<Book> generateListOfNBooks(int booksQantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

}
