package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testMakeTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask("driving");
        driving.executeTask();
        Task painting = taskFactory.makeTask("painting");
        painting.executeTask();
        Task shopping = taskFactory.makeTask("shopping");
        shopping.executeTask();
        Task nullTask = taskFactory.makeTask(" ");

        //Then
        Assert.assertEquals("drive", driving.getTaskName());;
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("paint", painting.getTaskName());;
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("buy", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals(null, nullTask);
    }
}
