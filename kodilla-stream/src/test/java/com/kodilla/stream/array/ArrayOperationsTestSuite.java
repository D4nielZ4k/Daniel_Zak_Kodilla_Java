package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    void firstTestGetAverage(){
        //Given
        int[] muIntArray0 = {22,22,10,10};
        //Then
        double result0 = ArrayOperations.getAverage(muIntArray0);
        //When
        Assertions.assertEquals(16,result0 ,0);
    }
    void secondTestGetAverage(){
        //Given
        int[] myIntArray1 = {10, 2, 8, 6, 7};
        //Then
        double result1 = ArrayOperations.getAverage(myIntArray1);
        //When
        Assertions.assertEquals(4.80, result1, 2);

    }
    void thirdTestGetAverage(){
        //Given
        int[] myIntArray2 = {20};
        //Then
        double result2 = ArrayOperations.getAverage(myIntArray2);
        //When
        Assertions.assertEquals(20, result2, 0);

    }
}
