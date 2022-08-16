package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.math.BigDecimal;

public class PizzaTestSuite {
    @Test
    public void basicOrderTest(){

        //Given
        PizzaOrder theOrder = new BasicPizza();

        //When
        BigDecimal expectedPrice = theOrder.getPrise();
        String expectedName = theOrder.GetName();

        //Then
        Assertions.assertEquals(new BigDecimal(15), expectedPrice);
        Assertions.assertEquals("Margarita",expectedName);
    }
    @Test
    public void pizzaWithOneToppingsTest(){

        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraHam(theOrder);

        //When
        BigDecimal expectedPrice = theOrder.getPrise();
        String expectedName = theOrder.GetName();

        //Then
        Assertions.assertEquals(new BigDecimal(18), expectedPrice);
        Assertions.assertEquals("Margarita + ham",expectedName);
    }
    @Test
    public void pizzaWithTwoToppingsTest(){

        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraHam(theOrder);
        theOrder = new ExtraHotSauce(theOrder);

        //When
        BigDecimal expectedPrice = theOrder.getPrise();
        String expectedName = theOrder.GetName();

        //Then
        Assertions.assertEquals(new BigDecimal(20), expectedPrice);
        Assertions.assertEquals("Margarita + ham + hot sauce",expectedName);
    }
    @Test
    public void pizzaWithThreeToppingsTest(){

        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraHam(theOrder);
        theOrder = new ExtraMozzarella(theOrder);
        theOrder = new ExtraHotSauce(theOrder);

        //When
        BigDecimal expectedPrice = theOrder.getPrise();
        String expectedName = theOrder.GetName();

        //Then
        Assertions.assertEquals(new BigDecimal(23), expectedPrice);
        Assertions.assertEquals("Margarita + ham + mozzarella + hot sauce",expectedName);
    }
}
