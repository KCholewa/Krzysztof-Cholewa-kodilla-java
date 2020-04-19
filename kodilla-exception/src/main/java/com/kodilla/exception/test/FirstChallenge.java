package com.kodilla.exception.test;

public class FirstChallenge {

     public double divide(double a, double b) throws ArithmeticException {

        double product = 0;
        try {
             product = a / b;
             if(b == 0){
                  throw new ArithmeticException();
             }
        } catch (ArithmeticException e) {
             System.out.println("Division by Zero: "+e);
        } finally {
             System.out.println("Division attempt done");
        }
        return product;
     }

        /**
         * This main can throw an ArithmeticException!!!
         * @param args
         */

    public static void main (String[] args){

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }

}