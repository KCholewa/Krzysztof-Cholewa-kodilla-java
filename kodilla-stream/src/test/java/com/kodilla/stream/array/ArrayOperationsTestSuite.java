package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
   public void testGetAverage() {
        //Given
        int[] array = {1,1,1,1,1,1,1,1,1,1,3,3,3,3,3,3,3,3,3,3};

        //When
        double average = ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(2.0, average, 0.001);
    }
}
