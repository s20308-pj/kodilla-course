package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

@Autowired
    Calculator calculator;

    @Test
    public void testAdd(){
        //Given
        //When
        double result = calculator.add(2,3);

        //Then
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSub(){
        //Given
        //When
        double result = calculator.sub(3,2);

        //Then
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testMul(){
        //Given
        //When
        double result = calculator.mul(2,2);

        //Then
        Assertions.assertEquals(4, result);
    }
    @Test
    public void testDiv(){
        //Given
        //When
        double result = calculator.div(8,2);

        //Then
        Assertions.assertEquals(4, result);
    }
}
