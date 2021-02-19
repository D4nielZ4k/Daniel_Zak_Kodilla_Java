package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
        usersList.add(new ForumUser(1,"Antoni" ,1,'M',  LocalDate.of(2020,3,12)));
        usersList.add(new ForumUser(2,"Halina" ,15,'F', LocalDate.of(2000,3,12)));
        usersList.add(new ForumUser(3,"Czeslaw" ,22,'M', LocalDate.of(2003,3,12)));
        usersList.add(new ForumUser(4,"Piotrek" ,125,'M', LocalDate.of(1955,3,12)));
        usersList.add(new ForumUser(5,"Andrzej" ,1232,'M', LocalDate.of(1998,3,12)));
        usersList.add(new ForumUser(6,"Konrad" ,0,'M', LocalDate.of(1965,4,3)));
    }

    public List<ForumUser> getUsersList() {
        return usersList;
    }
}
