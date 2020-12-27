package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("52"));
        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("32"));
        try {
            warehouse.getOrder("46");
            System.out.println("Order confirmed");
        } catch (OrderDoesntExistException e) {
            System.out.println("Not existing order/wrong order number");
        }
    }
}

