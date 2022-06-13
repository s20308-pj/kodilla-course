package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {

    @Test
    void testToString() {
        //Given

        //creating the TaskList for todos
        TasksList listToDo = new TasksList(("To Do Tasks"));
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To do task number " + n)));

        //creating the TaskList for task in progress
        TasksList listInProgress = new TasksList(("In progress tasks"));
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In progress task number " + n)));

        //creating the TaskList for done tasks
        TasksList listDone = new TasksList(("Done Task"));
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("to do task number " + n)));

        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assertions.assertEquals(2, board.getLists().size());
        Assertions.assertEquals(2, clonedBoard.getLists().size());
        Assertions.assertEquals(3, deepClonedBoard.getLists().size());
        Assertions.assertEquals(clonedBoard.getLists(), board.getLists());
        Assertions.assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
