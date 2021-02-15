package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]

        }
        return resultMap;

    }


    public double averageTemperatures() {
        List<Double> temperatureList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperatureList.add(temperature.getValue());
        }
        double sum = temperatureList.stream().mapToDouble(Double::doubleValue).sum();
        return sum/temperatureList.size();
    }

    public double medianTemperatures() {
        List<Double> temperatureList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperatureList.add(temperature.getValue());
        }
        Collections.sort(temperatureList);

        for (int i = 0; i<temperatureList.size(); i++){
            if(temperatureList.size()%2 == 0){
                int temp = temperatureList.size() /2;
                return (temperatureList.get(temp)  + temperatureList.get(temp-1))/2;
            }
        }
        return temperatureList.get(temperatureList.size() /2 );
    }
}
