package com.kodilla.good.patterns.challenges.airlines;

import java.util.Objects;

public class Flight {

    String cityOfDeparture;
    String cityOfArrival;


    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public Flight(String cityOfDeparture, String cityOfArrival) {
        this.cityOfDeparture = cityOfDeparture;
        this.cityOfArrival = cityOfArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getCityOfDeparture(), flight.getCityOfDeparture()) && Objects.equals(getCityOfArrival(), flight.getCityOfArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCityOfDeparture(), getCityOfArrival());
    }
}
