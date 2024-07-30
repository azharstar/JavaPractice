package arrays;

import java.util.Scanner;

public class HighestMarks {

    public static void main(String[] args) {
        // Create an array to store marks of 20 students
        int[] marks = new int[20];
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the marks of 20 students
        System.out.println("Enter the marks of 20 Students: ");
        for (int index = 0; index < marks.length; index++) {
            // Read the marks from the user
            marks[index] = sc.nextInt();
            
            // Check if the entered marks are within the valid range (1-100)
            if (marks[index] >= 100) {
                System.out.println("Please Enter the marks between 1-100");
                break;
            }
        }
        
        // Display the entered marks
        System.out.println("Entered marks are: ");
        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index] + " ");
        }
        
        // Initialize the highest marks with the first student's marks
        int Hmarks = marks[0];
        
        // Iterate through the array to find the highest marks
        for (int index = 1; index < marks.length; index++) {
            if (marks[index] > Hmarks)
                Hmarks = marks[index];
        }
        
        // Display the highest marks among the 20 students
        System.out.println("Highest marks among 20 students is: " + Hmarks);
    }
}
