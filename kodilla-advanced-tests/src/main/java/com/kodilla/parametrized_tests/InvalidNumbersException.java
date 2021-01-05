package com.kodilla.parametrized_tests;

public class InvalidNumbersException extends Exception {

    public InvalidNumbersException() {
        super("Wrong numbers provided");
    }
}
