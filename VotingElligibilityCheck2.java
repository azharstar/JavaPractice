package exceptionhandling;

import java.util.Scanner;

// Custom Exception class for handling negative age values
class AgeException extends Exception {
    // Constructor for AgeException that takes a message
    public AgeException(String msg) {
        // calling constructor of base class Exception
        super(msg);
    }
}

class Voter {
    int age;

    // Constructor to initialize Voter object with user input
    public Voter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age (in year) :");
        age = sc.nextInt();
    }

    // Method to check eligibility for voting
    public boolean isElligible() throws AgeException {
        if (age >= 18) {
            return true;
        } else if (age >= 0) {
            return false;
        } else {
            // Throw custom exception if age is negative
            throw new AgeException("A person with negative Age does not exist.");
        }
    }
}

public class VotingElligibilityCheck2 {
    public static void main(String[] args) {
        // Creating a Voter object
        Voter voterObj = new Voter();
        try {
            // Checking voting eligibility
            voterObj.isElligible();
        } catch (AgeException e) {
            // Handling the custom exception and printing message
            System.out.println(e.getMessage());
        }
    }
}
