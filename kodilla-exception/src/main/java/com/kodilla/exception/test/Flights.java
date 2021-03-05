package com.kodilla.exception.test;

import java.util.HashSet;
import java.util.Set;

public class Flights {
    public static void main(String[] args) {

        String departureAirport = "GDN";
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight(departureAirport, "WAW"));
        flights.add(new Flight(departureAirport, "WMI"));
        flights.add(new Flight(departureAirport, "WRO"));
        flights.add(new Flight(departureAirport, "POZ"));
        flights.add(new Flight(departureAirport, "KRK"));
        flights.add(new Flight(departureAirport, "KTW"));
        flights.add(new Flight(departureAirport, "LCJ"));
        flights.add(new Flight(departureAirport, "L1231CJ"));


        SearchFlights searchFlights = new SearchFlights();

        for (Flight flight : flights) {
            try {
                System.out.printf("%s: %s \n",flight,
                        searchFlights.findFilght(flight) ? "SCHEDULED" : "CANCELED");

            }catch (RouteNotFoundException e){
                System.out.println( e.getMessage());
            }
        }

    }
}
