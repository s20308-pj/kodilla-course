package com.kodilla;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.UserDataHandler;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("circle");

        //When
        String name = shape.getShapeName();

        //Then
        Assertions.assertEquals("This is a Circle.", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {
        //Givew
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("triangle");
        //When
        String name = shape.getShapeName();

        //Then
        Assertions.assertEquals("This is a Triangle.", name);
    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("createSquare");

        //When
        String name = shape.getShapeName();

        //Then
        Assertions.assertEquals("This is a Square.", name);
    }

    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape is: " + name);
    }
}
