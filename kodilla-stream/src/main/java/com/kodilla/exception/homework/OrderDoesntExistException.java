package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {

    public OrderDoesntExistException(String orderNumber) {
        super("Order " +  orderNumber + " not found.");
    }
}
