package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];

        //When
        numbers[0] = 20;
        numbers[1] = 10;
        numbers[2] = 5;
        numbers[3] = 30;
        numbers[4] = 10;
        numbers[5] = 5;
        numbers[6] = 4;
        numbers[7] = 2;
        numbers[8] = 4;
        numbers[9] = 5;
        numbers[10] = 6;
        numbers[11] = 2;
        numbers[12] = 2;
        numbers[13] = 20;
        numbers[14] = 25;
        numbers[15] = 5;
        numbers[16] = 15;
        numbers[17] = 12;
        numbers[18] = 8;
        numbers[19] = 40;

        //Then
        Assert.assertEquals(11.5, ArrayOperations.getAverage(numbers), 0.001);


    }
}

