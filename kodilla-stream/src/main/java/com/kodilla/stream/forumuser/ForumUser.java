package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    final private int signature;
    final private String nameForumUser;
    private char sexForumUser = 'M'/'F';
    final private LocalDate data;

    final private int postsForumUser;

    public ForumUser(int signature, String nameForumUser, int postsForumUser, final char sexForumUser, final LocalDate data) {
        this.signature = signature;
        this.nameForumUser = nameForumUser;
        this.sexForumUser= sexForumUser;
        this.postsForumUser = postsForumUser;
        this.data = data;
    }


    public int getSignature() {
        return signature;
    }

    public String getNameForumUser() {
        return nameForumUser;
    }

    public char getSexForumUser() {
        return sexForumUser;
    }

    public int getPostsForumUser() {
        return postsForumUser;
    }
    public LocalDate getDatadate(){
        return data;
    }


    @Override
    public String toString() {
        return
                "  Name = '" + nameForumUser + '\'' +
                "sex = " + sexForumUser +
                "Posts = " + postsForumUser +
                "Data =" +data+"|||||"

                ;
    }
}
