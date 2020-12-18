package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Book bookOne = bookManager.createBook("Canzoniere", "Francesco Petrarca");
        Book bookTwo = bookManager.createBook("Decamerone", "Giovanni Boccaccio");
        Book bookThree = bookManager.createBook("Canzoniere", "Francesco Petrarca");

        System.out.println(bookOne == bookTwo);
        System.out.println(bookOne == bookThree);
    }
}
