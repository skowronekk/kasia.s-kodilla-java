package com.kodilla.testing.forum.statistics;


public class ForumStatistics {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostCountPerUser;
    private double avgCommentCountPerUser;
    private double avgCommentCountPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        avgPostCountPerUser = postCount / userCount;
        avgCommentCountPerUser = commentCount / userCount;
        avgCommentCountPerPost = commentCount / postCount;
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostCountPerUser() {
        return avgPostCountPerUser;
    }

    public double getAvgCommentCountPerUser() {
        return avgCommentCountPerUser;
    }

    public double getAvgCommentCountPerPost() {
        return avgCommentCountPerPost;
    }
}

