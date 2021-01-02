package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void findFlightsFrom() {
        assertEquals(1, flightFinder.findFlightsFrom("LAX").size());
    }

    @Test
    public void findFlightsTo() {
        assertEquals(1, flightFinder.findFlightsTo("JFK").size());
    }

    @Test
    public void testEmptyDepartureTable() {
        List<Flight> result = flightFinder.findFlightsFrom("");
        assertEquals(0, result.size());
    }

    @Test
    public void testEmptyArrivalTable() {
        List<Flight> result = flightFinder.findFlightsTo("");
        assertEquals(0, result.size());
    }
}