package arrays;

import java.util.Scanner;

public class Average {

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
        
        float avg;
        int sum = 0;
        
        // Calculate the sum of the entered elements
        System.out.println("Sum of the entered elements: ");
        for (int index = 0; index < size; index++) {
            sum += numbers[index];
        }
        System.out.println(sum);
        
        // Calculate the average of the entered elements
        avg = sum / size;
        System.out.println("Average: " + avg);
    }
}
