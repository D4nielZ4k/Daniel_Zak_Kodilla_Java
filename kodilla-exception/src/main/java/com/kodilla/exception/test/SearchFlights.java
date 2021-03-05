package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlights {


    private static Map<String,Boolean> arrivalAbilities = new HashMap<>();
    {

        arrivalAbilities.put("WAW", false);
        arrivalAbilities.put("WMI", true);
        arrivalAbilities.put("WRO", true);
        arrivalAbilities.put("POZ", false);
        arrivalAbilities.put("KRK", true);
        arrivalAbilities.put("KTW", true);
        arrivalAbilities.put("LCJ", true);


    }


    public boolean findFilght (Flight flight) throws  RouteNotFoundException{
        if(flight == null){
            throw new RouteNotFoundException(flight);
        }
    String arrival = flight.getArrivalAirport();
        if(!arrivalAbilities.containsKey(arrival)){
            throw new RouteNotFoundException(flight);
        }
        return arrivalAbilities.get(arrival);
    }
}
