package com.kodilla.stream.world;

import java.util.List;

public class Continent {

    private final String continentName;

    private final List<Country> countries ;

    public Continent( String continentName, List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getContinentName() {
        return continentName;
    }
}
