package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testBoard() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        String toDo = "Project 3";
        String inProgress = "Project 2";
        String done = "Project 1";

        //When
        board.getToDolist().addTask(toDo);
        board.getInProgressList().addTask(inProgress);
        board.getDoneList().addTask(done);
        String toDoResult = board.getToDolist().getTasks().get(0);
        String inProgressResult = board.getInProgressList().getTasks().get(0);
        String doneResult = board.getDoneList().getTasks().get(0);

        //Then
        Assert.assertEquals("Project 3", toDoResult);
        Assert.assertEquals("Project 2", inProgressResult);
        Assert.assertEquals("Project 1", doneResult);

    }
}
