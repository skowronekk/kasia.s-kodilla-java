package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightsList {

        public static List<Flight> getTheFlightsList() {
            List<Flight> theFlightsList = new ArrayList<>();
            theFlightsList.add(new Flight("Warsaw", "London"));
            theFlightsList.add(new Flight("London", "New York"));
            theFlightsList.add(new Flight("Oslo", "Moscow"));
            theFlightsList.add(new Flight("Moscow", "Beijing"));
            theFlightsList.add(new Flight("London", "Beijing"));
            theFlightsList.add(new Flight("Beijing", "Delhi"));
            return new ArrayList<>(theFlightsList);
        }
    }

