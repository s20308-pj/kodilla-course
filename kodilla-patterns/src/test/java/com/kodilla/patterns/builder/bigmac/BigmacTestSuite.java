package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void bicmacBuilderTest(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("BUN")
                .burgers(2)
                .sauce("standard")
                .ingredient("ONION")
                .ingredient("CHEESE")
                .ingredient("Bacon")
                .build();
        System.out.println(bigmac);

        //When
        String expectedBun = bigmac.getBun();
        int expectedBurgers = bigmac.getBurgers();
        String expectedSauce = bigmac.getSauce();
        int howManyIngredients = bigmac.getIngredients().size();


        //Then
        Assertions.assertEquals("BUN",expectedBun);
        Assertions.assertEquals(2,expectedBurgers);
        Assertions.assertEquals("STANDARD", expectedSauce);
        Assertions.assertEquals(3, howManyIngredients);
    }
}
