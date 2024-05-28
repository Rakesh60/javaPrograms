package Rakesh_28_may_Task;

public class Calculator {
    
    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(10, 5)); // 15.0

        System.out.println("Subtraction: " + calculator.subtract(10, 5)); // 5.0

        System.out.println("Multiplication: " + calculator.multiply(10, 5)); // 50.0

   
        System.out.println("Division: " + calculator.divide(10, 5)); // 2.0

        
    }
}
