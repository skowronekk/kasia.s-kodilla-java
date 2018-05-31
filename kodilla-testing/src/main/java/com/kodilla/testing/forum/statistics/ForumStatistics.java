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

        if (userCount > 0) {
            avgPostCountPerUser = postCount / (double) userCount;
        } else {
            avgPostCountPerUser = 0;
        }

        if (userCount > 0) {
            avgCommentCountPerUser = commentCount / (double) userCount;
        } else {
            avgCommentCountPerUser = 0;
        }

        if (postCount > 0) {
            avgCommentCountPerPost = commentCount / (double) postCount;
        } else {
            avgCommentCountPerPost = 0;
        }
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

