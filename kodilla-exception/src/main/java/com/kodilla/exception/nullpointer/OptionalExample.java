package com.kodilla.exception.nullpointer;
import com.kodilla.exception.nullpointer.User;


import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");
        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u-> System.out.println(u.getName()));


        // String username = optionalUser.orElse(new User("", 0, 0, "")).getName();
        // System.out.println(username);


    }
}
