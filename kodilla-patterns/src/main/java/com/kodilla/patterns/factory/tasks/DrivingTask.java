package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private static boolean taskStatus;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        taskStatus = true;
        System.out.println("task has ben executed");
    }

    @Override
    public String getTaskName() {
       return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}