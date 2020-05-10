package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class testCalculations {

    @Test
    public void testCalculatorFunctions() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when

        double sum = calculator.add(10,5);
        double sub = calculator.sub(10, 5);
        double mul = calculator.mul(10,5);
        double div = calculator.div(10, 5);

        //then
        Assert.assertEquals(true, Double.isFinite(div));
        Assert.assertEquals(15.0, sum, 0.01);
        Assert.assertEquals(5.0, sub, 0.01);
        Assert.assertEquals(50.0, mul, 0.01);
        Assert.assertEquals(2.0, div, 0.01);
    }
}
