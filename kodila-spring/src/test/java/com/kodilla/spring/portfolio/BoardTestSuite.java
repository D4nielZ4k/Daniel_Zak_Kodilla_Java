package com.kodilla.spring.portfolio;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
       //When
        Board board = (Board) context.getBean("getBoard");
        board.getToDoList().getTasks().add("Task 1");
        board.getInProgressList().getTasks().add("Task 2");
        board.getDoneList().getTasks().add("Task 3");

        //Then
        Assertions.assertEquals(1,board.getDoneList().getTasks().size());
        Assertions.assertEquals(1,board.getInProgressList().getTasks().size());
        Assertions.assertEquals(1,board.getDoneList().getTasks().size());



        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }


}
