package com.kodilla.spring.portfolio;


import com.kodilla.spring.reader.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {

   @Bean(name = "getBoard")
   public Board getBoard (){
       return new Board(getTodoList(),getInProgressList(),getDoneList());
   }


   @Bean(name="toDoList")
   public TaskList getTodoList (){
       return new TaskList();
    }

    @Bean(name="InProgress")
    public TaskList getInProgressList(){
       return new TaskList();

    }

    @Bean(name="DoneList")
    public TaskList getDoneList(){
        return new TaskList();

    }
}
