package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CoutingStatistics implements Statistics {
    private int valuesUsers;
    private int valuesUserComments;
    private int valuesUsersPosts;
    private double averagePostPerUser;
    private double averageCommentPerUser;
    private double averageCommentPerPost;

    public CoutingStatistics(Statistics statistics) {

    }

    @Override
    public List<String> usersNames() {
        return null;
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }

    void calculateAdvStatistics(Statistics statistics) {
        this.valuesUsers = statistics.usersNames().size();
        this.valuesUserComments = statistics.commentsCount();
        this.valuesUsersPosts = statistics.postsCount();

        if (valuesUsersPosts!=0 && valuesUsers !=0) {
            double valuePostsToDouble = valuesUsersPosts;
            double valueUsersCommentsToDouble = valuesUserComments;
            double valuesUsersToDouble = valuesUsers;


           this.averageCommentPerPost = valueUsersCommentsToDouble / valuePostsToDouble;
           this.averagePostPerUser = valuePostsToDouble / valuesUsersToDouble;
            this.averageCommentPerUser = valueUsersCommentsToDouble / valuesUsersToDouble;
        }


    }

    public String showStatistics(double averagePostPerUser, double averageCommentPerUser, double averageCommentPerPost) {

        return
                "averagePostPerUser = " + averagePostPerUser +
                        "averageCommentPerUser = " + averageCommentPerUser +
                        "averageCommentPerPost = " + averageCommentPerPost
                ;
    }

    public int getValuesUsers() {
        return valuesUsers;
    }

    public int getValuesUserComments() {
        return valuesUserComments;
    }

    public int getValuesUsersPosts() {
        return valuesUsersPosts;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }
}
