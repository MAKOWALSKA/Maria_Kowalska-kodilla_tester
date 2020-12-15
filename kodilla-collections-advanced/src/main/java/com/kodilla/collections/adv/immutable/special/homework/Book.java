package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Objects;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getTitle().equals(book.getTitle()) &&
                getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


}
