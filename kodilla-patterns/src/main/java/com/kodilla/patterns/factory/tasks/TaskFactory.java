package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String driving = "driving";
    public static final String painting = "painting";
    public static final String shopping = "shopping";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case driving: {
                DrivingTask drivingTask = new DrivingTask("driving", "shop", "car");
                drivingTask.executeTask();
                System.out.println(drivingTask.getTaskName() + " to " + drivingTask.getWhere() + " using " + drivingTask.getUsing());
                return drivingTask;
            }
            case painting: {
                PaintingTask paintingTask = new PaintingTask("painting", "blue", "wall");
                paintingTask.executeTask();
                System.out.println(paintingTask.getTaskName() + " " + paintingTask.getColor() + " " + paintingTask.getWhatToPaint());
                return paintingTask;
            }
            case shopping: {
                ShoppingTask shoppingTask = new ShoppingTask("buy", "bread", 1.0);
                shoppingTask.executeTask();
                System.out.println(shoppingTask.getTaskName() +" " + shoppingTask.getQuantity() + " "+ shoppingTask.getWhatToBuy());
                return shoppingTask;
            }
            default:
                return null;
        }
    }
}
