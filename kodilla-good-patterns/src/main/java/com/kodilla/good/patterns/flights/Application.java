package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {
        System.out.println(FlightSearcher.searchByArrivalAirport("Beijing"));
        System.out.println(FlightSearcher.searchByDepartureAirport("Warsaw"));
        System.out.println(FlightSearcher.searchForConnectingFlights("Warsaw", "London",
                "New York"));

    }
}
