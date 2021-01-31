package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void addBookTest(){
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController =  new BookController(bookServiceMock);
        bookController.addBook(new BookDto("Gone with the wind","Margaret Mitchell"));
        bookController.addBook(new BookDto("Pride and Prejudice","Jane Austen"));
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(new BookDto("Gone with the wind","Margaret Mitchell"));
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(new BookDto("Pride and Prejudice","Jane Austen"));
    }
}
