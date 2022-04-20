package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(0,numbers.length).forEach(n -> System.out.print(numbers[n]+ " "));

        return  IntStream.range(0, numbers.length).map(n->numbers[n]).average().orElse(0);
    }
}
