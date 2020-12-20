package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;

public class BookManager {

    public static HashSet<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {

        for (Book book : books) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)) {
                return book;
            }
        }
        Book newBook = new Book(author, title);
        books.add(newBook);
        return newBook;
    }
}
