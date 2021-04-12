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
        TaskList taskListToDoList = (TaskList) context.getBean("toDoList");
        TaskList taskListInProgress = (TaskList) context.getBean("InProgress");
        TaskList taskListDoneList = (TaskList) context.getBean("DoneList");

        taskListToDoList.getTasks().add("Task1");
        taskListInProgress.getTasks().add("Task2");
        taskListDoneList.getTasks().add("Task3");

        //Then
        Assertions.assertEquals(1, board.getToDoList().getTasks().size());
        Assertions.assertEquals(1, board.getInProgressList().getTasks().size());
        Assertions.assertEquals(1, board.getDoneList().getTasks().size());


        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }


}
