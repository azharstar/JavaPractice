package polymorphism;

import java.util.Scanner;

// Class to handle shape area calculations
class AreaCalculator {
    // Method to calculate area of a circle
    public void calculateArea(float radius) {
        System.out.println("Radius of the Circle is: " + radius + " cm");
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area + " cm");
    }

    // Method to calculate area of a square
    public void calculateArea(int side) {
        System.out.println("Side of the Square is: " + side + " cm");
        float area = side * side;
        System.out.println("Area of Square: " + area + " cm");
    }

    // Method to calculate area of a rectangle
    public void calculateArea(float length, float breadth) {
        System.out.println("Length of the Rectangle is: " + length + " cm");
        System.out.println("Breadth of the Rectangle is: " + breadth + " cm");
        float area = length * breadth;
        System.out.println("Area of Rectangle: " + area + " cm");
    }
}

public class AreaExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();
        boolean exit = false;

        // Loop to display menu until user chooses to exit
        while (!exit) {
            System.out.println("------Menu------:");
            System.out.println("1. Calculate area of Circle");
            System.out.println("2. Calculate area of Square");
            System.out.println("3. Calculate area of Rectangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // Switch case to handle user choice
            switch (choice) {
                case 1:
                    // Calculating area of circle 
                    ac.calculateArea(5.0f);
                    break;
                case 2:
                    // Calculating area of square
                    ac.calculateArea(7);
                    break;
                case 3:
                    // Calculating area of rectangle 
                    ac.calculateArea(5.0f, 5.0f);
                    break;
                case 4:
                    // Exit the loop
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again");
            }
        }
    }
}
