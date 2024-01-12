package Com.Java.Works;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Get the operator from the user
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the calculation based on the operator
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
          
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
    
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

