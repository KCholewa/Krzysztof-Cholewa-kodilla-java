package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String driving = "driving";
    public static final String painting = "painting";
    public static final String shopping = "shopping";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case driving: {
                DrivingTask drivingTask = new DrivingTask("drive", "shop", "car");
                return drivingTask;
            }
            case painting: {
                PaintingTask paintingTask = new PaintingTask("paint", "blue", "wall");
                return paintingTask;
            }
            case shopping: {
                ShoppingTask shoppingTask = new ShoppingTask("buy", "bread", 1.0);
                return shoppingTask;
            }
            default:
                return null;
        }
    }
}
