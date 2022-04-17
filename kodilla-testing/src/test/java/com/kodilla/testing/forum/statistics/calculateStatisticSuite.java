package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class calculateStatisticSuite {

    @Mock
    Statistics statisticsMock;

    List<String> fillUserList(int numberOfUser) {
        List<String> userList = new ArrayList<>();
        for (int i = 0; i < numberOfUser; i++) {
            userList.add("Kos" + i);
        }
        return userList;
    }

    @Test
    void testCalculateStatisticWhenNumberOfPostsIsZero() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userName = fillUserList(2);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(10);

        //When
        calculateStatistics.calculateAdvStatistic(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.getNumberOfPosts());
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerPost());
        assertEquals(0, calculateStatistics.getAverageNumberOfPostsPreUser());
    }

    @Test
    void testCalculateStatisticWhenNumberOfPostsIsThousand() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userName = fillUserList(2);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(10);

        //When
        calculateStatistics.calculateAdvStatistic(statisticsMock);

        //Then
        assertEquals(1000, calculateStatistics.getNumberOfPosts());
        assertEquals(0.01, calculateStatistics.getAverageNumberOfCommentsPerPost()); // 10/1000
        assertEquals(500, calculateStatistics.getAverageNumberOfPostsPreUser()); // 1000/2
    }

    @Test
    void testCalculateStatisticWhenNumberOfCommandsIsZero() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistic(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.getNumberOfComments());
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerPost()); // 0/10
    }

    @Test
    void testCalculateStatisticWhenNumberOfCommentsGraterThanPosts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentCount()).thenReturn(10);

        //When
        calculateStatistics.calculateAdvStatistic(statisticsMock);

        //Then
        assertTrue(calculateStatistics.getNumberOfComments() < calculateStatistics.getNumberOfPosts());
    }
    @Test
    void testCalculateStatisticWhenNumberOfCommentsSmallerThanPosts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentCount()).thenReturn(20);

        //When
        calculateStatistics.calculateAdvStatistic(statisticsMock);

        //Then
        assertTrue(calculateStatistics.getNumberOfComments() > calculateStatistics.getNumberOfPosts());
    }
    @Test
    void testCalculateStatisticWhenNumberOfUserIsZero() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userName = fillUserList(0);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentCount()).thenReturn(10);

        //When
        calculateStatistics.calculateAdvStatistic(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.getNumberOfUsers());
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerUser());
        assertEquals(0, calculateStatistics.getAverageNumberOfPostsPreUser());
    }
    @Test
    void testCalculateStatisticWhenNumberOfUserIsHundred() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userName = fillUserList(100);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentCount()).thenReturn(10);

        //When
        calculateStatistics.calculateAdvStatistic(statisticsMock);

        //Then
        assertEquals(100, calculateStatistics.getNumberOfUsers());
        assertEquals(0.1, calculateStatistics.getAverageNumberOfCommentsPerUser()); // 10/100
        assertEquals(0.1, calculateStatistics.getAverageNumberOfPostsPreUser()); // 10/100
    }

}

