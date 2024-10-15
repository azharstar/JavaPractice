package exceptionhandling; // Declaring the package name

import java.util.Scanner; // Importing the Scanner class for user input
import java.util.regex.Pattern; // Importing the Pattern class for regular expression matching

// Custom exception class for invalid email formats
class InvalidEmailFormatException extends Exception {
    public InvalidEmailFormatException(String message) {
        super(message); // Call the constructor of the superclass with the error message
    }
}

public class EmailValidator {

    // Regular expression for validating email addresses
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    
    // Compiling the regular expression into a Pattern for performance
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    // Method to validate an email address
    public static void validateEmail(String email) throws InvalidEmailFormatException {
        // Check if the provided email matches the defined regex pattern
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            // If it doesn't match, throw an InvalidEmailFormatException
            throw new InvalidEmailFormatException("Invalid email format: " + email);
        }
        // If valid, print a success message
        System.out.println("Email is valid: " + email);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter an email address to validate: "); // Prompt the user to enter an email address
        String email = scanner.nextLine(); // Read the user input

        // Try to validate the email and handle potential exceptions
        try {
            validateEmail(email); // Call the validateEmail method
        } catch (InvalidEmailFormatException e) {
            // If an InvalidEmailFormatException is thrown, print the error message
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }
}
