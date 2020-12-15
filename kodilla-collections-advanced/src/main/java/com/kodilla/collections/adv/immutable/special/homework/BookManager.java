package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;

public class BookManager {

    public static HashSet<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {

        books.add(new Book("La Divina Comedia", "Dante Alighieri"));
        books.add(new Book("Il Canzoniere", "Francesco Petrarca"));
        books.add(new Book("Decamerone", "Giovanni Boccaccio"));

        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return book;
            }

        }
        return new Book(title, author);
    }
}
//wiem, ze nie jest ok - znalazlam info a propo hashset na testers help, dodalam hashset i ksiazki
//trzeba dodac metode sprawdzajaca czy obiekt juz istnieje... boolean contains(Object o)? jesli tak, to nie wiem, jak to zrobic. help, pls:)

