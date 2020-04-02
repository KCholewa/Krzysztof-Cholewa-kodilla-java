package com.kodilla.testing.shape;
import org.junit.*;
import java.util.ArrayList;


public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeTests() {
        System.out.println("All tests starting");
    }

    @AfterClass
    public static void afterTests() {
        System.out.println("All tests finished");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square s1 = new Square(8.0);
        //When

        shapeCollector.addFigure(s1);

        //Then
        Assert.assertEquals(1, shapeCollector.getFigures().size());
    }

    @Test
    public void testRemoveFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square s1 = new Square(8.0);
        shapeCollector.addFigure(s1);
        //When
        shapeCollector.removeFigure(s1);
        //Then
        Assert.assertEquals(0, shapeCollector.getFigures().size());

    };

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shape = new ShapeCollector();
        Triangle t1 = new Triangle(5.0, 7.0);
        shape.addFigure(t1);
        //When
        Shape result = shape.getFigure(0);
        //Then
        Assert.assertEquals(t1, result);
    }
   };


