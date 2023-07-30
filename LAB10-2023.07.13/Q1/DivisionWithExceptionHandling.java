package com.mycompany.divisionwithexceptionhandling;
import java.util.Scanner;
public class DivisionWithExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            // Perform division and handle ArithmeticException
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
    
}
