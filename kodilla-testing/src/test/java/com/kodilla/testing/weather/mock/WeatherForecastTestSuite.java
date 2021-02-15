package com.kodilla.testing.weather.mock;                                        // [1]

import com.kodilla.testing.weather.stub.Temperatures;                            // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                         // [3]
import org.junit.jupiter.api.Assertions;                                         // [4]
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;                                               // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;                                                        // [6]
import java.util.Map;                                                            // [7]

import static org.mockito.Mockito.mock;                                          // [8]
import static org.mockito.Mockito.when;                                          // [9]
@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

   public static Map<String, Double> temperaturesMap = new HashMap<>();


    @BeforeEach
    public void beforeEveryTest() {

        System.out.println("Preparing to execute test " );
    }
    @BeforeAll
    public static void beforeAllTest(){
        temperaturesMap.put("Rzeszow",18.0);
        temperaturesMap.put("Krakow", 20.0);
        temperaturesMap.put("Wroclaw", 16.0);
        temperaturesMap.put("Warszawa", 14.0);
        temperaturesMap.put("Gdansk", 17.0);
    }
    @Mock
    private Temperatures temperaturesMock;
    @Test
    void testCalculateForecastWithMock() {

       // Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverageTemperature(){

        //Given

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double result = weatherForecast.averageTemperatures();

        //Then
        Assertions.assertEquals(17,result);
    }
    @Test
    void test_Calculate_Median_Temperatures() {

        //Given

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double result = weatherForecast.medianTemperatures();

        //Then
        Assertions.assertEquals(17, result);
    }
}
