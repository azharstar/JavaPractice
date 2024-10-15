package exceptionhandling;

import java.util.Scanner;

public class MultipleException {

    public static void main(String[] args) {
        // Creating an instance of Scanner to read input from keyboard
        Scanner sc = new Scanner(System.in);
        
        // Array of numbers to be used in division operations
        int[] numbers = {78, 89, 91, 0, 45};
        
        // Prompting user to enter any number
        System.out.println("Enter any Number: ");
        int num = sc.nextInt();
        
        try {
            // Looping through the array and performing division operations
            for(int index = 0; index <= numbers.length; index++) {
                System.out.println("On Dividing " + numbers[index] + " by :" + num);
                
                // Calculating and printing the quotient
                System.out.println("Quotient: " + numbers[index] / num);
                
                // Calculating and printing the remainder
                System.out.println("Remainder: " + numbers[index] % num);
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            // Handling multiple exceptions: division by zero and array index out of bounds
            System.out.println("Exception Occurred: " + exception.getMessage());
        }
    }
}
