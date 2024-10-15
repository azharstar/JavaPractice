package exceptionhandling;

import java.util.Scanner;

public class DivisionExceptionExample {

    public static void main(String[] args) {
        int num1, num2;
        
        // Creating an object of Scanner class to read input from keyboard
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for first number
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        
        // Prompting user for second number
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        
        try {
            // Printing the division results
            System.out.println("On Dividing " + num1 + " by " + num2 + " : ");
            
            // Calculating and printing the quotient
            System.out.println("Quotient: " + (num1 / num2));
            
            // Calculating and printing the remainder
            System.out.println("Remainder: " + (num1 % num2));
            
        } catch (Exception e) {
            // Handling any exceptions, particularly division by zero
            System.out.println("Unable to divide a number by Zero: " + e);
        } finally {
            // Closing the scanner to avoid resource leak
            sc.close();
            // Indicating that the task is completed
            System.out.println("----Task Completed----");
        }
    }
}
