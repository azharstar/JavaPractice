package stringhandling;

//Write a program to input a sentence and count the number of vowels in it

// Importing the Scanner class for user input
import java.util.Scanner;

public class VowelsCounter {

    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a sentence
        System.out.println("Enter any Sentence: ");
        
        // Reading the entire line of input from the user
        String s1 = sc.nextLine();
        
        // Converting the input sentence to uppercase to simplify vowel checking
        String upper = s1.toUpperCase();
        
        // Initializing a counter for vowels
        int vowels = 0;
        
        // Looping through each character in the sentence
        for (int index = 0; index < upper.length(); index++) {
            // Getting the character at the current index
            char character = upper.charAt(index);
            
            // Checking if the character is a vowel
            if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                // Incrementing the vowel counter if a vowel is found
                vowels++;
            }
        }
        
        // Printing the original sentence
        System.out.println("The Sentence is: ");
        System.out.println(s1);
        
        // Printing the total number of vowels in the sentence
        System.out.println("Total No.of Vowels in the Sentence is/are: " + vowels);
    }
}
