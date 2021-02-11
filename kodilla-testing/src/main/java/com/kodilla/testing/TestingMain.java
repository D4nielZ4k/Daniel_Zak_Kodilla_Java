package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(5,5);

       int resultAdd = 10;
       int resultSubtract=0;

       if (resultAdd == 10){
           System.out.println("Test OK");
       }else {
           System.out.println("Error!");
       }

       if (resultSubtract == 0){
           System.out.println("Test OK");
       }else {
           System.out.println("Error!");
       }
    }
}
