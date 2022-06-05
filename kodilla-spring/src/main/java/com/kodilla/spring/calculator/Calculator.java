package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;


    public double add(double a, double b) {
        double result = a + b;

        display.displayValue(result);

        return result;
    }

    public double sub(double a, double b) {
        double result = a - b;

        display.displayValue(result);

        return result;
    }

    public double mul(double a, double b) {
        double result = a * b;

        display.displayValue(result);

        return result;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("you can not divide by zero");
            return 0;
        }

        double result = a / b;

        display.displayValue(result);

        return result;
    }
}
