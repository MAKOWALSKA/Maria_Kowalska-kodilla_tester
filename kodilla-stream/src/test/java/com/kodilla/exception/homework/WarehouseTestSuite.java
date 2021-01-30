package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse();

    @Test
    public void testOnExistingOrder() throws OrderDoesntExistException {
        // given
        warehouse.addOrder(new Order("4"));
        // when
        Order result = warehouse.getOrder("4");
        // then
        assertNotNull(result);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testOnExistingOrder_withException() throws OrderDoesntExistException {
        //given
        warehouse.addOrder(new Order("52"));
        warehouse.addOrder(new Order("12"));
        // when & then
        warehouse.getOrder("46");
    }
}
