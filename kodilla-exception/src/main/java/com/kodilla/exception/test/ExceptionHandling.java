package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            Double result = secondChallenge.probablyIWillThrowException(2.5, 1.5);
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Illegal number");
        } finally {
            System.out.println("Task is finished");
        }

    }

}
