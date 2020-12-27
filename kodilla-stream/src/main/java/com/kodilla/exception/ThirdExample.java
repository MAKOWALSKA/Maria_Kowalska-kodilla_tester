package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status " + isViennaInUse);
        } catch(AirportNotFoundException e) {
            System.out.println("Sorry, this airport cnnot be served by our airlines");
        }
        System.out.println("Thank ou for using Kodilla Airlines");
    }
}
