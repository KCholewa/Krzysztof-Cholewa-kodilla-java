package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();
        int addResult = calc.add(5, 5);
        int subResult = calc.subtract(10, 5);

        if (addResult == 10 && subResult == 5 ){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        System.out.println("Test - pierwszy test jednostkowy:");
    }
}
