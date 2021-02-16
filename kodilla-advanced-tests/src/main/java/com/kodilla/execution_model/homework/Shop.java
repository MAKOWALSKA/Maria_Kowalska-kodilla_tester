package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private final List<Order> orders = new ArrayList<>();

    public List<Order> getOrder() {
        return orders;
    }
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrderBtwTwoDates(LocalDate from, LocalDate to) {
        if (to.isBefore(from))
            return Collections.emptyList();
        return orders.stream()
                .filter(date -> date.getDate().isAfter(from)&& date.getDate().isBefore(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrderFromValueRange(double min, double max) {
        if (orders.size() == 0)
            return Collections.emptyList();
        return orders.stream()
                .filter(value -> value.getValue() >= min && value.getValue() <= max)
                .collect(Collectors.toList());
    }

    public int getShopSize() {
        return orders.size();
    }

    public double  getTotalValue() {
        return orders.stream()
                .map(Order::getValue)
                .mapToDouble(a ->a)
                .sum();
    }
}
