package stringhandling;

import java.util.Scanner;

// This program inputs any sentence and counts the number of consonants in it.
public class ConsonantCounter {

    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner sc = new Scanner(System.in);
       
        // Prompting the user to enter a sentence
        System.out.println("Enter any Sentence: ");
        
        // Reading the entire line of input from the user
        String s1 = sc.nextLine();
        
        // Converting the input sentence to uppercase to simplify consonant checking
        String upper = s1.toUpperCase();
        
        // Initializing a counter for consonants
        int consonants = 0;
        
        // Looping through each character in the sentence
        for (int index = 0; index < upper.length(); index++) {
            // Getting the character at the current index
            char character = upper.charAt(index);
            
            // Checking if the character is a consonant
            if (character >= 'A' && character <= 'Z' ) {
            	if (!(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')){
                // Incrementing the consonant counter if a consonant is found
                consonants++;
            	}
            }
        }
        
        // Printing the original sentence
        System.out.println("The Sentence is: ");
        System.out.println(s1);
        
        // Printing the total number of consonants in the sentence
        System.out.println("Total No.of Consonants in the Sentence is/are: " + consonants);
    }
}
