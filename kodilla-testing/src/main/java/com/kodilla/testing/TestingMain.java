package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.addAToB(5, 5);

        if (result == 10) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int result2 = calculator.substractAFromB(10, 5);
        if (result2 == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}