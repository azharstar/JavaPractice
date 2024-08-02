package controlstatements;

import java.util.Scanner;

// Class to check if a number is a palindrome
class Palindrome {
    int number;
    int revnum = 0;
    int originalnumber;

    // Method to take input from the user
    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = sc.nextInt();
        originalnumber = number; // Store the original number
    }

    // Method to reverse the number
    public void reverseNumber() {
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            revnum = revnum * 10 + digit; // Append the digit to the reversed number
            number = number / 10; // Remove the last digit from the number
        }
    }

    // Method to check if the number is a palindrome and print the result
    public void checkPalindrome() {
        if (originalnumber == revnum) {
            System.out.println(originalnumber + " is a Palindrome");
        } else {
            System.out.println(originalnumber + " is not a Palindrome");
        }
    }
}

// Initial Class
public class PalindromeOrNot {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.inputNumber();         // Take input from the keyboard
        p.reverseNumber();       // Reverse the number
        p.checkPalindrome();     // Check if the number is a palindrome and print the result
    }
}
