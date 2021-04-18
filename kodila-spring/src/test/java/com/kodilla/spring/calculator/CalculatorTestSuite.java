package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {

        //Given
        //When
        double add = calculator.add(5, 5);
        double sub = calculator.sub(5, 5);
        double div = calculator.div(5, 5);
        double mul = calculator.mul(5, 5);
        //Then
        Assertions.assertEquals(add, 10);
        Assertions.assertEquals(sub, 0);
        Assertions.assertEquals(div, 1);
        Assertions.assertEquals(mul, 25);

    }
}
