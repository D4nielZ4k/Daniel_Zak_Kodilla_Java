package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final static String SHOPPINGTASK = "SHOPPINGTASK";
    public final static String PAINTINGTASK = "PAINTINGTASK";
    public final static String DRIVINGTASK = "DRIVINGTASK";

    public final Task TaskCreator(final String tasks) {

        switch (tasks) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping task", "what to bur", 2);
            case PAINTINGTASK:
                return new PaintingTask("Painting task", "color", "what to paint");
            case DRIVINGTASK:
                return new DrivingTask("DrivingTask", "Where", "Using");
            default:
                return null;
        }
    }
}
