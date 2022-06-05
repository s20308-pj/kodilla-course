package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Display {


    public void displayValue(double val){
        System.out.println(val);
    }
}
