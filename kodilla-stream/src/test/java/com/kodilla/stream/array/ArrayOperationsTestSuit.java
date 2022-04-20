package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuit {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {10, 22, 3, 5,7, 8};
        double expectedAverageNumber = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            expectedAverageNumber = sum / numbers.length;
        }

        //When
        double averageNumbers = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(expectedAverageNumber, averageNumbers);
    }
}
