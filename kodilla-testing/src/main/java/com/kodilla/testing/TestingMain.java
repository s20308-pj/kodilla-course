package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzienie do testowania oprogramowania");

        Calculator calculator = new Calculator();
        //Test add
    int result = calculator.add(10,20);
        if (result == 30){
            System.out.println("test add: PASSED");
        } else {
            System.out.println("test add: FAILED");
        }
        //Test subtract

        result = calculator.subtract(30,20);
        if (result == 10){
            System.out.println("test subtract: PASSED");
        } else {
            System.out.println("test subtract: FAILED");
        }
    }
}
