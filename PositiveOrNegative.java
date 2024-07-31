package methods;

import java.util.Scanner;

public class PositiveOrNegative {
    // Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        int res = a + b; // Calculate the sum
        return res; // Return the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter Two Numbers: "); // Prompt the user to enter two numbers
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int res = sum(a, b); // Call the sum method and store the result
        System.out.println("Sum of " + a + " and " + b + " is : " + res); // Display the sum

        // Check if the result is positive, negative, or zero
        if (res > 0)
            System.out.println(res + " is a Positive Integer");
        else if (res < 0)
            System.out.println(res + " is a Negative Integer");
        else
            System.out.println("Sum is Zero");
    }
}
