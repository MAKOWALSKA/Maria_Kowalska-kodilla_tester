package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void findFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("LAX");

        assertEquals("LAX", Flight.departure);
    }

    @Test
    public void findFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsTo("JFK");

        assertEquals("JFK", Flight.arrival);
    }
}