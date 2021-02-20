package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        List<Country> Europa = new ArrayList<>();
        List<Country> Asia = new ArrayList<>();
        List<Country> Africa = new ArrayList<>();
        //Europa
        Europa.add(new Country("Polska ", new BigDecimal("40000000")));
        Europa.add(new Country("Szwecja ", new BigDecimal("1000000")));
        Europa.add(new Country("Niemcy ", new BigDecimal("8000000")));
        Europa.add(new Country("Czechy ", new BigDecimal("20564851")));
        //Asia
        Asia.add(new Country("Chiny ", new BigDecimal("1685456842")));
        Asia.add(new Country("Rosia ", new BigDecimal("144251256")));
        Asia.add(new Country("Filipiny ", new BigDecimal("106584125")));
        Asia.add(new Country("Korea północna ", new BigDecimal("25568425")));
        //Africa
        Africa.add(new Country("RPA ", new BigDecimal("57785236")));
        Africa.add(new Country("Uganda ", new BigDecimal("42321548")));
        Africa.add(new Country("Ghana ", new BigDecimal("29874526")));
        Africa.add(new Country("Mozambik ", new BigDecimal("29562584")));
        List<Continent> continents = new ArrayList<>();
        Continent europa = new Continent("Europa" ,Europa);
        Continent asia = new Continent("Asia" , Asia);
        Continent africa = new Continent("Africa" , Africa);
        World world = new World(continents);
        continents.add(europa);
        continents.add(asia);
        continents.add(africa);
        //When
        BigDecimal resultSuma = new BigDecimal("2190969393");
        //Then
        Assertions.assertEquals(resultSuma ,world.getPeopleQuantity());



        System.out.println(world.getPeopleQuantity());
    }
}
