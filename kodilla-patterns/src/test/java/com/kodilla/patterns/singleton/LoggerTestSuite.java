package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    private static Logger logger = Logger.INSTANCE;

    @Test
    void testGetLastLog(){
        //Given
        logger.log("test log");

        //When
        String expectedLog = logger.getLastLog();

        //Then
        Assertions.assertEquals(expectedLog, "test log");
    }
}
