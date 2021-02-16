package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private final String clientLoginName;
    private final LocalDate orderDate;
    private final double orderValue;

    public Order(String clientLoginName,LocalDate orderDate, double orderValue) {
        this.clientLoginName = clientLoginName;
        this.orderDate = orderDate;
        this.orderValue = orderValue;
    }

    public double getValue() {
        return orderValue;
    }

    public LocalDate getDate() {
        return orderDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Order order = (Order) obj;
        return orderValue == order.orderValue && Objects.equals(orderDate,order.orderDate)&&
                Objects.equals(clientLoginName,order.clientLoginName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientLoginName,orderDate,orderValue);
    }

    @Override
    public String toString() {
        return "Order: "+" / Order Value in PLN: " + orderValue+" / Date order: "+ orderDate + " / client (login) : "
                + clientLoginName;
    }
}
