package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board(){
        return new Board(toDoList(), tinProgressList(),doneList());
    }

    @Bean
    public TaskList toDoList(){
        return new TaskList();
    }

    @Bean
    public TaskList tinProgressList(){
        return new TaskList();
    }

    @Bean
    public TaskList doneList(){
        return new TaskList();
    }
}
