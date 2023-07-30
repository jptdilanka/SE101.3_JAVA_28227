package com.mycompany.arrayoutofboundshandling;
public class ArrayOutOfBoundsHandling {

    public static void main(String[] args) {
        
        int[] numbers = { 10, 20, 30, 40, 50 };
        try {
            int value = numbers[10];
            System.out.println("Value at index 10: " + value);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: Invalid index. The array size is " + numbers.length + ".");
        }
    }
}
