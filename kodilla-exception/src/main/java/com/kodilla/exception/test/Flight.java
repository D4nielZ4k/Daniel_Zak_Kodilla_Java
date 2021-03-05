package com.kodilla.exception.test;

import java.util.Objects;

public final class Flight {

    final private  String departureAirport;
    final private String arrivalAirport;



    public Flight(final String departureAirport,final String arrivalAirport) {
        if (departureAirport == null || departureAirport .isEmpty()||
        arrivalAirport == null || arrivalAirport.isEmpty()){
            throw new IllegalArgumentException();
        }

        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDepartureAirport(), flight.getDepartureAirport()) && Objects.equals(getArrivalAirport(), flight.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport(), getArrivalAirport());
    }

    @Override
    public String toString() {
        return "Flight from " + departureAirport + '\'' +
                " to " + arrivalAirport + '\'';
    }
}
