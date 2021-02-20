package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

public class World {

    List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {


        return continents.stream()
                .flatMap(people -> people.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }

}
