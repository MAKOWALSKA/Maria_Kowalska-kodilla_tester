package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private static List<Flight> flights;

    public List<Flight> findFlightsFrom(String departure) {
        flights = FlightRepository.getFlightTable();
        List<Flight> flightDeparture = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                flightDeparture.add(flight);
            }
        }
        return flightDeparture;
    }

    public List<Flight> findFlightsTo(String arrival) {
        flights = FlightRepository.getFlightTable();
        List<Flight> flightArrival = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                flightArrival.add(flight);
            }
        }
        return flightArrival;
    }
}
