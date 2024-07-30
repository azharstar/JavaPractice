package arrays;

import java.util.Scanner;

public class EvenNum {

    public static void main(String[] args) {
        int[] numbers;
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        
        // Initialize the array with the specified size
        numbers = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " elements: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = sc.nextInt();
        }
        
        // Display the entered numbers
        System.out.println("Numbers are: ");
        for (int index = 0; index < size; index++) {
            System.out.println(numbers[index] + " ");
        }
        
        // Display the even numbers from the entered elements
        System.out.println("Even numbers from entered elements: ");
        for (int index = 0; index < size; index++) {
            if (numbers[index] % 2 == 0)
                System.out.println(numbers[index] + " ");
        }
    }
}
