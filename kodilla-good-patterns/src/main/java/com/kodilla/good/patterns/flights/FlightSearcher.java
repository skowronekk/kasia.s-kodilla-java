package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FlightSearcher {

    public static List<Flight> searchByDepartureAirport(String departCity) {
        return FlightsList.getTheFlightsList().stream()
                .filter(f -> f.getDepartureCity().equals(departCity))
                .collect(Collectors.toList());

    }

    public static List<Flight> searchByArrivalAirport(String arrivalCity) {
        return FlightsList.getTheFlightsList().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());

    }

    public static List<Flight> searchForConnectingFlights(String departCity, String connectingCity, String arrivalCity) {
        List<Flight> result = FlightsList.getTheFlightsList().stream()
                .filter(f -> (f.getDepartureCity().equals(departCity)) && (f.getArrivalCity().equals(connectingCity)))
                .collect(Collectors.toList());

        result.addAll(FlightsList.getTheFlightsList().stream()
                .filter(f -> f.getDepartureCity().equals(connectingCity) && f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList()));
        return result;

    }
}
