package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class TaskListDaoTestSuite {

    private static final String DESCRIPTION = "Test: Task List";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("ToDoList", DESCRIPTION);
        taskListDao.save(taskList);
        String taskName = taskList.getListName();

        //When
        List<TaskList> read = taskListDao.findByListName(taskName);

        //Then
        Assertions.assertEquals(1, read.size());

        //CleanUp
        taskListDao.delete(taskList);


    }

}

