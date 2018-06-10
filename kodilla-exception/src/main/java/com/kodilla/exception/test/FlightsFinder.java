package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsFinder {
    public Map<String, Boolean> findFlight (String airport) throws RouteNotFoundException {

        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Frankfurt", true);
        flights.put("London", false);
        flights.put("New York", false);
        flights.put("Warsaw", true);


        if (!flights.containsKey(airport)) {
            throw new RouteNotFoundException();
        }
        if (flights.containsKey(airport)) {
            boolean value = flights.get(airport);
            if (value == true) {
                System.out.println("Flight is possible");
            } else {
                System.out.println("Flight is impossible");
            }
        }
        return flights;
    }
}

