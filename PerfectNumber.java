package methods;

import java.util.Scanner;

// Class to check if a number is perfect or not
class Perfect {
    int number, sum = 0;

    // Method to take input from the user
    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = sc.nextInt();
    }

    // Method to calculate the sum of  divisors
    public void calculateDivisors() {
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
    }

    // Method to check number is perfect ?
    public void isPerfect() {
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}

// Initial Class
public class PerfectNumber {
    public static void main(String[] args) {
        Perfect p = new Perfect();
        p.inputNumber();         // input from the keyboard
        p.calculateDivisors();   // Calculate the sum of proper divisors
        p.isPerfect();           // Check if the number is perfect and print the result
    }
}
