package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    public final String taskName;
    public final String whatToBuy;
    public final double quantity;
    private static boolean taskStatus;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public void executeTask() {
        taskStatus = true;
        System.out.println("Task has been executed");
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
