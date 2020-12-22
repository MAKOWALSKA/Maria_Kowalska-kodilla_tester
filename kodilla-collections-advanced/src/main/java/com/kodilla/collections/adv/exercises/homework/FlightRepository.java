package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>();

    public static List<Flight> getFlightTable() {
        flights = new ArrayList<>();
        Flight flight1 = new Flight("KRK", "MXP");
        Flight flight2 = new Flight("YVR", "HKG");
        Flight flight3 = new Flight("SYD", "LGW");
        Flight flight4 = new Flight("LAX", "JFK");

        flights.add(0, flight1);
        flights.add(1, flight2);
        flights.add(2, flight3);
        flights.add(3, flight4);

        return flights;
    }



}


