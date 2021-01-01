package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>();

    public static List<Flight> getFlightTable() {
        flights = new ArrayList<>();
        flights.add(new Flight("KRK", "MXP"));
        flights.add(new Flight("YVR", "HKG"));
        flights.add(new Flight("SYD", "LGW"));
        flights.add(new Flight("LAX", "JFK"));
        return flights;
    }
}


