package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {

        //Given
        String listName1 = "list1";
        String listName2 = "list2";

        TaskList taskList1 = new TaskList(listName1, "test list number 1");
        TaskList taskList2 = new TaskList(listName2, "test list number 2");

        //When
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);
        long id1 = taskList1.getId();
        long id2 = taskList2.getId();
        String expectedListName1 = taskListDao.findByListName(listName1).get(0).getListName();
        String expectedListName2 = taskListDao.findByListName(listName2).get(0).getListName();

        taskListDao.save(taskList2);

        //Then
        Assertions.assertEquals(taskList1.getListName(),expectedListName1);
        Assertions.assertEquals(taskList2.getListName(),expectedListName2);


        //CleanUp
        taskListDao.deleteById(id1);
        taskListDao.deleteById(id2);
    }

}
