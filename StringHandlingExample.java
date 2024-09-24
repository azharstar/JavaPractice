package stringhandling;

// Import the Scanner class for user input
import java.util.Scanner;

public class StringHandlingExample {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.println("Enter any Sentence: ");
        
        // Read the entire line of input
        String s1 = sc.nextLine();
        
        // Initialize counters for uppercase and lowercase characters
        int upper_case = 0;
        int lower_case = 0;
        
      /* 
       USING WRAPPER CLASS 
        // Loop through each character in the string
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) 
                upper_case++;
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) 
                lower_case++;
        }
        */
        for(int index =0;index<s1.length();index++) {
        	char character=s1.charAt(index);
        	if(character>='A' && character <='Z')
        		upper_case++;
        	else if(character>='a' && character <='z')
        		lower_case++;
        }
        // Display the original sentence
        System.out.println("The Sentence is: " + s1);
        
        // Display the count of uppercase letters
        System.out.println("Uppercase letters: " + upper_case);
        
        // Display the count of lowercase letters
        System.out.println("Lowercase letters: " + lower_case);
    }
}
