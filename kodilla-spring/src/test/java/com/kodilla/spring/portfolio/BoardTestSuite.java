package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTaskToList("finish course");
        board.getInProgressList().addTaskToList("coding");
        board.getDoneList().addTaskToList("game");

        //Then
        Assertions.assertEquals(board.getToDoList().takeTasksList().size(), 1);
        Assertions.assertEquals(board.getInProgressList().takeTasksList().get(0), "coding");
        Assertions.assertNotEquals(board.getDoneList().takeTasksList().get(0), "finish course");
    }
}
