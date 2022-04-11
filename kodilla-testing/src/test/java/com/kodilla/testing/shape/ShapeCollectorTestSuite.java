package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeEach
    void setUp() {
        testCounter++;
        System.out.println("start test nr.: " + testCounter);
    }

    @AfterEach
    void tearDown() {
        System.out.println("test nr.: " + testCounter + " was ended");
    }

    @Nested
    @DisplayName("testing addFigure")
    class AddFigure {
        @Test
        void addTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10);

            //When
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(shapeCollector.shapeList.get(0), triangle);
        }

        @Test
        void addCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(15.3);

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(shapeCollector.shapeList.get(0), circle);
        }

        @Test
        void addSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(100);

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(shapeCollector.shapeList.get(0), square);
        }

        @Test
        void testAddingManyShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10);
            Circle circle = new Circle(15.3);
            Square square = new Square(100);

            //When
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(shapeCollector.shapeList.size(), 3);
        }
    }

    @Nested
    @DisplayName("testing removeFigure")

    class removeFigure {
        @Test
        void removeFigureIfExist() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10);
            shapeCollector.addFigure(triangle);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertTrue(result);
        }
        @Test
        void removeFigureIfDoesntExist() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10);
            shapeCollector.addFigure(triangle);
            Circle circle = new Circle(15.3);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertFalse(result);
        }
    }

    @Test
    void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10);
        shapeCollector.addFigure(triangle);

        //When
        Shape resultTriangle = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(resultTriangle, triangle);
    }

    @Test
    void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10);
        Circle circle = new Circle(15.3);
        String expectedString = triangle.toString() +
                circle.toString();

        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        String result = shapeCollector.showFigures();

        //Then
        Assertions.assertEquals(expectedString, result);
    }
}