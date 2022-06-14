package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {


    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.taskFactory(TaskFactory.SHOPPING);

        //Then
        Assertions.assertEquals("grocery shopping" ,task.getTaskName());
        Assertions.assertFalse(task.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.taskFactory(TaskFactory.PAINTING);
        task.executeTask();

        //Then
        Assertions.assertEquals("painting living room" ,task.getTaskName());
        Assertions.assertTrue(task.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.taskFactory(TaskFactory.DRIVING);

        //Then
        Assertions.assertEquals("morning drive" ,task.getTaskName());

    }
}
