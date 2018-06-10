package com.kodilla.exception.test;


public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        FlightsFinder flightsFinder = new FlightsFinder();

        try {
            flightsFinder.findFlight("London");

        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found");

        } finally {

            System.out.println("End of process");


        }
    }
}
