package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTaskToList(String taskText){
        tasks.add(taskText);
    }
    public List<String> takeTasksList(){
        return tasks;
    }


}
