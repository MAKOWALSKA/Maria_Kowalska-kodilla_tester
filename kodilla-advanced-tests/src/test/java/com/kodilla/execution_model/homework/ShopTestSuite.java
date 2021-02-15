package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order one = new Order("Angelo Comunello", LocalDate.of(2020,12,31),250 );
    Order two = new Order("Radoslaw Jaskot", LocalDate.of(2019,4,2),100 );
    Order three = new Order("Michal Marzec", LocalDate.of(2018,2,27), 80);

    @BeforeAll
    public static void IntroMessage(){
        System.out.println("Starting testing.");
    }

    @BeforeEach
    public void addOrder() {
        shop.addOrder(one);
        shop.addOrder(two);
        shop.addOrder(three);
    }

    @Test
    public void addOrderTest() {
        int numberOfOrders = shop.getShopSize();
        assertEquals(3, numberOfOrders);
    }

    @Test
    //są zamówienia
    public void existingOrderTotalValueTest() {
        shop.getTotalValue();
        assertEquals(430, shop.getTotalValue(), 0.01);
    }

    @Test
    //nie ma zamowien (sum 0)
    public void totalValueWhenNoOrdersMadeTest() {
        shop.getOrder().clear();
        assertEquals(0, shop.getTotalValue());
    }

    @Test
    public void returnNumberOfOrdersBetweenTwoDates() {
        int list = shop.getOrderBtwTwoDates
                (LocalDate.of(2020,12,1),
                        LocalDate.of(2021,1,1)).size();
        assertEquals(1, list);
    }

    @Test
    public void returnEmptyListWhenDatesAreIncorrect() {
        List<Order> orders = shop.getOrderBtwTwoDates
                (LocalDate.of(2021,1,1),
                        LocalDate.of(2020,12,1));
        assertEquals(Collections.emptyList(), orders);
    }

    @Test
    public void getNumberOfOrdersInValueRangeTest() {
        List<Order> orders = shop.getOrderFromValueRange(90,260);
        assertEquals(2, orders.size());
    }

    @Test
    public void returnEmptyListWhenValuesAreIncorrect() {
        List<Order> orders = shop.getOrderFromValueRange(1000, 500);
        assertEquals(Collections.emptyList(), orders);
    }

    @Test
    public void returnEmptyListWhenOrdersOutOfValueRange() {
        List<Order> orders = shop.getOrderFromValueRange(500, 1000);
        assertEquals(Collections.emptyList(), orders);
    }

    @AfterEach
    public void resetValues(){
        System.out.println("Next test.");
    }

    @AfterAll
    public static void GoodByeMessage(){
        System.out.println("Testing completed.");
    }
}
