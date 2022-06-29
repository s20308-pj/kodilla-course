package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.TaskList;
import org.assertj.core.api.AssertionInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;



@SpringBootTest
public class TaskDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LISTNAME = "Some name of list";
    @Autowired
    private TaskDao taskDao;
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        Assertions.assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }

    @Test
    void teatTaskDaoFindByDuration(){
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTask = taskDao.findByDuration(duration);

        //Then
        Assertions.assertEquals(1, readTask.size());

        //CleanUp
        int id = readTask.get(0).getId();
        taskDao.deleteById(id);
    }
    @Test
    void testTaskDaoSaveWithFinancialDetails(){
        //Given
        Task task = new Task(DESCRIPTION,30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(task);
        int id = task.getId();

        //Then
        Assertions.assertNotEquals(0,id);

        //CleanUp
        taskDao.deleteById(id);
    }
    @Test
    void testTaskListDaoSaveWithTasks(){
        //Given
        Task task1 = new Task("Test: learn hibernate", 14);
        Task task2 = new Task("Test: write some entities", 3);
        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        task1.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assertions.assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}
