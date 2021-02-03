package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order one = new Order("Angelo Comunello", LocalDate.of(2020,12,31),250 );
    Order two = new Order("Radoslaw Jaskot", LocalDate.of(2019,4,2),100 );
    Order three = new Order("Michal Marzec", LocalDate.of(2018,2,27), 80);

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
    public void returnEmptyListWhenDataOrderIsOutOfRange() {
        List<Order> emptyList = shop.getOrderFromCertainPeriod
                (LocalDate.of(2020,5,30),
                        LocalDate.of(2018,2,1));
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void getOrderInValueRangeTest() {
        List<Order> orders = shop.getOrderFromValueRange(90,260);
        assertEquals(2, orders.size());
    }

    @Test
    public void returnEmptyListWhenOrdersOutOfValueRange() {
        List<Order> emptyList1 = shop.getOrderFromValueRange(500, 1000);
        assertEquals(Collections.emptyList(), emptyList1);
    }

    @Test
    public void totalValueTest() {
        shop.getTotalValue();
        assertEquals(430, shop.getTotalValue(), 0.01);
    }

    @Test
    public void getExistingOrderTest() {
        Order result = shop.getOrder(0);
        assertEquals("Angelo Comunello", result.getClientLoginName());
        assertEquals(250, result.getOrderValue());
    }

    @Test
    public void orderWhichDoesNotExistTest() {
        Order order = shop.getOrder(50);
        assertNull(order.getOrderDate());
    }

    @AfterEach
    public void resetValues(){
        System.out.println("Next test.");
    }

    @BeforeAll
    public static void IntroMessage(){
        System.out.println("Starting testing.");

    }

    @AfterAll
    public static void GoodByeMessage(){
        System.out.println("Testing completed.");
    }
}
