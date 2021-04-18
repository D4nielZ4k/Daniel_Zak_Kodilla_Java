package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void shoppingTaskTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.TaskCreator(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assertions.assertEquals(shoppingTask.getTaskName(), "Shopping task");
    }

    @Test
    void PaintingTaskTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.TaskCreator(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assertions.assertEquals(paintingTask.getTaskName(),"Painting task");
        Assertions.assertEquals(paintingTask.isTaskExecuted(),true);
    }

    @Test
    void drivingTaskTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.TaskCreator(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assertions.assertEquals(drivingTask.getTaskName(),"DrivingTask");
        Assertions.assertEquals(drivingTask.isTaskExecuted(),true);
    }
}
