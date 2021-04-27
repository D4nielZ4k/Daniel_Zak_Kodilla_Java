package com.kodilla.spring.forum;


import org.springframework.stereotype.Component;

@Component
public class ForumUser  {

    private final String forumUserName;

    public ForumUser() {
        forumUserName = "John Smith";
    }

    @Override
    public String toString() {
        return  forumUserName;
    }
}
