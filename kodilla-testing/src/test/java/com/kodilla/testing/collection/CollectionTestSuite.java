package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    OddNumbersExterminator exterminator;
    @Before
    public void before(){
        System.out.println("Test rozpoczęty");
        exterminator = new OddNumbersExterminator();

    }

    @After
    public void after(){
        System.out.println("Test zakończony");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        ArrayList<Integer> emptyList = new ArrayList<>();

        //when
        ArrayList<Integer> result = exterminator.exterminate(emptyList);

        //then
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        ArrayList<Integer> properList = new ArrayList<>();
        properList.add(8);
        properList.add(30);
        properList.add(15);

        //when
        ArrayList<Integer> result = exterminator.exterminate(properList);

        //then
        Assert.assertEquals(2, result.size());
    }

}

