package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Testing begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("End");
    }
    @DisplayName("testing OddNumbersExterminator when list is empty")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = List.of();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(0, result.size());
    }

    @DisplayName("testing OddNumbersExterminator when list exist")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> expectedNumberList = Arrays.asList(2,4,6,8,10);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numberList);

        //Then
        Assertions.assertEquals(expectedNumberList, result);
    }
}
