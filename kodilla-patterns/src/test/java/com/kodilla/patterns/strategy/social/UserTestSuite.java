package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User janusz = new ZGeneration("Janusz");
        User zenon = new YGeneration("Zenon");
        User albert = new Millenials("Albert");

        //When
        System.out.println(janusz.getName() + " publish in " + janusz.sharePost());
        System.out.println(zenon.getName() + " publish in " + zenon.sharePost());
        System.out.println(albert.getName() + " publish in " + albert.sharePost());

        //Then
        Assertions.assertEquals("Twitter", janusz.sharePost());
        Assertions.assertEquals("Snapchat", zenon.sharePost());
        Assertions.assertEquals("Facebook", albert.sharePost());
    }
    @Test
    void testIndividualSharingStrategy(){
        //Given
        User janusz = new ZGeneration("Janusz");

        //When
        System.out.println(janusz.getName() + " publish in " + janusz.sharePost());
        janusz.setSocialPublisher(new FacebookPublisher());
        System.out.println(janusz.getName() + " now publish in " + janusz.sharePost());

        //Then
        Assertions.assertNotEquals("Twitter", janusz.sharePost());
        Assertions.assertEquals("Facebook", janusz.sharePost());
    }
}
