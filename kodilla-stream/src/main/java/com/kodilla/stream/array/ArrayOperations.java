package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static  double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .mapToDouble(a -> numbers[a])
                .forEach(a-> System.out.println(a));
        return IntStream.range(0, numbers.length)
                .mapToDouble(a -> numbers[a]).average().getAsDouble();


    }
}
