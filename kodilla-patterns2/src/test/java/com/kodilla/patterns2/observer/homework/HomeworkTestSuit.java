package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeworkTestSuit {

    @Test
    void homeworkUpdateTest(){

        //Given
        KodillaStudent student1 = new KodillaStudent("Jan", "Kowalski");
        KodillaStudent student2 = new KodillaStudent("Adam", "Nowak");

        Homework homework1 = new Homework("Test topic 1", "https://www.test1.com");
        Homework homework2 = new Homework("Test topic 2", "https://www.test2.com");
        Homework homework3 = new Homework("Test topic 3", "https://www.test3.com");
        Homework homework4 = new Homework("Test topic 4", "https://www.test4.com");

        Mentor mentor1 = new Mentor("Test Mentor 1");
        Mentor mentor2 = new Mentor("Test Mentor 2");

        student1.addMentor(mentor1);
        student2.addMentor(mentor2);

        //When
        student1.addHomework(homework1);
        student1.addHomework(homework2);
        student1.addHomework(homework3);
        student2.addHomework(homework4);

        //Then
        assertEquals(3, mentor1.getHomeworkToCheck());
        assertEquals(1, mentor2.getHomeworkToCheck());
    }
}