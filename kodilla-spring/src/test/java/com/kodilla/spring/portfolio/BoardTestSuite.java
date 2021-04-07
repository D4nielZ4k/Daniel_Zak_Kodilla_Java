package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("getBoard");
        board.toDoList.tasks.add("Task1");
        board.inProgressList.tasks.add("Task2");
        board.doneList.tasks.add("Task3");
        //Then
        Assertions.assertEquals("Task1", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("Task2", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Task3", board.getDoneList().getTasks().get(0));




        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }

}
