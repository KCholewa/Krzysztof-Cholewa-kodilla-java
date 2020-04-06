package com.kodilla.testing.forum.statistics;

import java.util.Collection;

public class CalculateStats {

    Statistics statistics;
    private double usersQty;
    private double postsQty;
    private double commentsQty;
    private double userPostsAverage;
    private double userCommentsAverage;
    private double postCommentsAverage;

    public Statistics getStatistics() {
        return statistics;
    }

    public double getUsersQty() {
        return usersQty;
    }

    public double getPostsQty() {
        return postsQty;
    }

    public double getCommentsQty() {
        return commentsQty;
    }

    public double getUserPostsAverage() {
        return userPostsAverage;
    }

    public double getUserCommentsAverage() {
        return userCommentsAverage;
    }

    public double getPostCommentsAverage() {
        return postCommentsAverage;
    }

    public CalculateStats(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersQty = statistics.usersNames().size();
        postsQty = statistics.postsCount();
        commentsQty = statistics.commentsCount();

        if(usersQty == 0) {
            userPostsAverage = 0;
            userCommentsAverage = 0;
        } else {
            userPostsAverage = postsQty/usersQty;
            userCommentsAverage = commentsQty / usersQty;
        }

        if(postsQty == 0) {
            postCommentsAverage = 0;
        } else {
            postCommentsAverage = commentsQty/postsQty;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " +getUsersQty());
        System.out.println("Number of posts: "+getPostsQty());
        System.out.println("Number of comments" +getCommentsQty());
        System.out.println("Average of post per user: "+ getUserPostsAverage());
        System.out.println("Average of comments per user: "+getUserCommentsAverage());
        System.out.println("Average of comments per post: "+getPostCommentsAverage());
    }

}

