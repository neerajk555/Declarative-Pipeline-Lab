package com.example;

/**
 * A simple Sample class to demonstrate a basic Java application
 * that can be built and tested using a Jenkins declarative pipeline.
 */
public class Sample {

    /**
     * A simple method that adds two numbers
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * A simple method that subtracts two numbers
     * 
     * @param a the first number
     * @param b the second number
     * @return the result of a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * A simple method that multiplies two numbers
     * 
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * A simple method that returns a greeting message
     * 
     * @param name the name to greet
     * @return a greeting message
     */
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    /**
     * Main method to demonstrate the Sample class
     */
    public static void main(String[] args) {
        Sample sample = new Sample();
        
        System.out.println("=== Declarative Pipeline Lab ===");
        System.out.println(sample.greet("Jenkins"));
        System.out.println("Addition: 10 + 5 = " + sample.add(10, 5));
        System.out.println("Subtraction: 10 - 5 = " + sample.subtract(10, 5));
        System.out.println("Multiplication: 10 * 5 = " + sample.multiply(10, 5));
        System.out.println("================================");
    }
}
