package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private static List<Flight> flights;

    public List<Flight> findFlightsFrom(String departure) {
        flights = FlightRepository.getFlightTable();
        List<Flight> flightDeparture = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.departure.equals(departure)) {
                flightDeparture.add(flight);
            }
        }
        if (flightDeparture.size() == 0) {
            return new ArrayList<>();
        }
        return flightDeparture;
    }

    public List<Flight> findFlightsTo(String arrival) {
        flights = FlightRepository.getFlightTable();
        List<Flight> flightArrival = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.arrival.equals(arrival)) {
                flightArrival.add(flight);
            }
        }
        if (flightArrival.size() == 0) {
            return new ArrayList<>();
        }
        return flightArrival;
    }
}
