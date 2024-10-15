package exceptionhandling;

import java.util.Scanner;

// Custom Exception for invalid age input
class AgeException extends Exception{
    // Constructor for AgeException that takes a message
    public AgeException(String msg) {
        // calling constructor of base class Exception
        super(msg);
    }
}

public class VotingElligibilityCheck {

    public static void main(String[] args) {
        int age;
        // Using try-with-resources to ensure Scanner gets closed
        try (Scanner sc = new Scanner(System.in)) {
            // Prompting user to enter age
            System.out.println("Enter age of person(in years):");
            age = sc.nextInt();
            
            // Check if age is 18 or more
            if (age >= 18) {
                System.out.println("Elligible for Voting");
            }
            // Check if age is non-negative but less than 18
            else if (age >= 0){
                System.out.println("Not Elligible for Voting");
            }
            // Throw custom exception if age is negative
            else {
                throw new InvalidAgeException("Negative age is Invalid");
            }
        } catch (InvalidAgeException e) {
            // Handling the custom exception and printing message
            System.out.println(e);
        }
    }
}
