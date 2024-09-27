package polymorphism;

import java.util.Scanner;

// Class to handle shape area calculations
class AreaCalculator {
    // Method to calculate area of a circle
    public static void calculateArea(float radius) {
        System.out.println("Radius of the Circle is: " + radius + " cm");
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area + " cm");
    }

    // Method to calculate area of a square
    public static void calculateArea(int side) {
        System.out.println("Side of the Square is: " + side + " cm");
        float area = side * side;
        System.out.println("Area of Square: " + area + " cm");
    }

    // Method to calculate area of a rectangle
    public static void calculateArea(float length, float breadth) {
        System.out.println("Length of the Rectangle is: " + length + " cm");
        System.out.println("Breadth of the Rectangle is: " + breadth + " cm");
        float area = length * breadth;
        System.out.println("Area of Rectangle: " + area + " cm");
    }
}

public class AreaExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
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
                	System.out.println("Enter the Radius of Circle:");
                	float radius = sc.nextFloat();
                	AreaCalculator.calculateArea(radius);
                    break;
                case 2:
                    // Calculating area of square
                	System.out.println("Enter Side of the Square: ");
                	int side = sc.nextInt();
                	AreaCalculator.calculateArea(side);
                    break;
                case 3:
                    // Calculating area of rectangle 
                	System.out.println("Enter Length and Breadth for the Rectangle: ");
                	float length = sc.nextFloat();
                	float breadth = sc.nextFloat();
                	AreaCalculator.calculateArea(length, breadth);
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
