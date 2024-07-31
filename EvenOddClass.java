package methods;

import java.util.Scanner;

// This class contains a method to check if a number is even or odd
public class EvenOddClass {

    // Method to check if a number is even or odd
    public static void evenOdd(int a) {
        // Check if 'a' is even
        if (a % 2 == 0)
            // Print  if 'a' is even
            System.out.println(a + " is Even");
        else
            // Print if 'a' is odd
            System.out.println(a + " is Odd");
    }

    public static void main(String[] args) { //Main
    	Scanner sc = new Scanner(System.in);
    	// Reading  data through keyboard
    	System.out.println("Enter a number: ");
    	int num = sc.nextInt();
    	evenOdd(num); // Calling Method
        
    }
}
