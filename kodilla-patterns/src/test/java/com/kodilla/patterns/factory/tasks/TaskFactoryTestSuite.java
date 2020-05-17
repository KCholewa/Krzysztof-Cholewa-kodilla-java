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
        Task painting = taskFactory.makeTask("painting");
        Task shopping = taskFactory.makeTask("shopping");
        Task nullTask = taskFactory.makeTask(" ");
        //Then
        Assert.assertEquals("driving", driving.getTaskName());;
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("painting", painting.getTaskName());;
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("buy", shopping.getTaskName());;
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals(null, nullTask);
    }
}
