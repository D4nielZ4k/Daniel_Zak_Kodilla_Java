package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(5,5);

       if (calculator.add() == 10){
           System.out.println("Test OK");
       }else {
           System.out.println("Error!");
       }

       if (calculator.subtract() == 0){
           System.out.println("Test OK");
       }else {
           System.out.println("Error!");
       }
    }
}
