package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, String> finalList = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSexForumUser() == 'M')
                .filter(forumUser -> forumUser.getDatadate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsForumUser()>0)
                .collect(Collectors.toMap(ForumUser::getSignature, ForumUser::toString));

        System.out.println(finalList);

    }
}
