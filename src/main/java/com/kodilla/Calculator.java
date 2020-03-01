package com.kodilla;

public class Calculator {

    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void add() {
        System.out.println(firstNumber+secondNumber);
    }

    public void sub() {
        System.out.println(firstNumber-secondNumber);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);
        calculator.add();
        calculator.sub();
    }
}
