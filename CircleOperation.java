package exceptionhandling;

import java.util.Scanner;

// Custom Exception class for handling negative radius values
class RadiusException extends Exception {
    public RadiusException(String msg) {
        super(msg);
    }
}

class Circle {
    float radius;

    // Constructor to initialize radius with user input
    Circle() {
        // Creating an instance of Scanner to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter radius
        System.out.println("Enter radius of the Circle: ");
        radius = sc.nextFloat();

        // Closing the scanner to avoid resource leak
        sc.close();
    }

    // Method to display circle information
    public void displayInfo() {
        System.out.println("=====CIRCLE=====");
        System.out.println("Radius of the Circle: " + radius);
    }

    // Method to calculate the area of the circle
    public void calculateArea() {
        try {
            if (radius < 0) {
                // Throw custom exception if radius is zero or negative
                throw new RadiusException("Radius cannot be negative.");
            } else {
                float area = 3.14f * radius * radius;
                // Printing the area of the circle
                System.out.println("Area of Circle: " + area);
            }
        } catch (RadiusException ne) {
            // Handling the custom exception and printing message
            System.err.println(ne.getMessage());
        }
    }

    // Method to calculate the perimeter of the circle
    public void calculatePerimeter() {
        try {
            if (radius < 0) {
                // Throw custom exception if radius is zero or negative
                throw new RadiusException("Radius cannot be negative.");
            } else {
                // Calculating and printing the perimeter of the circle
            	float perimeter = 2 * 3.14f * radius;
                System.out.println("Perimeter of Circle: " + perimeter);
            }
        } catch (RadiusException ne) {
            // Handling the custom exception and printing message
            System.err.println(ne.getMessage());
        }
    }
}

public class CircleOperation {

    public static void main(String[] args) {
        // Creating an instance of Circle to calculate area and perimeter
        Circle c = new Circle();
        c.displayInfo();
        c.calculateArea();
        c.calculatePerimeter();
    }
}
