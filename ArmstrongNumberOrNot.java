package methods;
import java.util.Scanner;

public class ArmstrongNumberOrNot {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the entered number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = countDigits(number);

        // Calculate the sum of the nth power of each digit
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Return true if the sum is equal to the original number
        return result == number;
    }

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        // Count the digits in the number
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
