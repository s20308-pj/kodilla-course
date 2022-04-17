package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPreUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPreUser() {
        return averageNumberOfPostsPreUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistic(Statistics statistics) {
        numberOfUsers = statistics.userName().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentCount();
        if (numberOfUsers != 0) {
            averageNumberOfPostsPreUser = (double) numberOfPosts / numberOfUsers;
            averageNumberOfCommentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            averageNumberOfPostsPreUser = 0.0;
            averageNumberOfCommentsPerUser = 0.0;
        }
        if (numberOfPosts != 0) {
            averageNumberOfCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            averageNumberOfCommentsPerPost = 0.0;
        }
    }


    public void showStatistics(){
        System.out.println("numberOfUsers= " + numberOfUsers +
                "\n numberOfPosts= " + numberOfPosts +
                "\n numberOfComments= " + numberOfComments +
                "\n averageNumberOfPostsPreUser= " + averageNumberOfPostsPreUser +
                "\n averageNumberOfCommentsPerUser= " + averageNumberOfCommentsPerUser +
                "\n averageNumberOfCommentsPerPost= " + averageNumberOfCommentsPerPost);
    }
}