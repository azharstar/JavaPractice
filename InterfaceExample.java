package abstraction_interface;

import java.nio.file.spi.FileSystemProvider;

// Defining interface
interface TwoDFigure {
    // Method for calculating perimeter
    void calculatePerimeter();
    // Method for calculating area
    void calculateArea();
}

// Defining Square class that implements TwoDFigure interface
class Square implements TwoDFigure {
    float side;

    // Constructor to initialize side of the square
    Square(float side) {
        this.side = side;
    }

    // Method to display details of the square
    public void display() {
        System.out.println("Square");
        System.out.println("Side : " + side + " cm");
    }

    // Overriding method to calculate perimeter of the square
    @Override
    public void calculatePerimeter() {
        float perimeter = 4 * side;
        System.out.println("Perimeter: " + perimeter + " cm");
    }

    // Overriding method to calculate area of the square
    @Override
    public void calculateArea() {
        float area = side * side;
        System.out.println("Area : " + area + " cm");
    }
}

// Defining Rectangle class that implements TwoDFigure interface
class Rectangle implements TwoDFigure {
    float length, breadth;

    // Constructor to initialize length and breadth of the rectangle
    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to display details of the rectangle
    public void display() {
        System.out.println("Rectangle");
        System.out.println("Length: " + length + " cm");
        System.out.println("Breadth: " + breadth + " cm");
    }

    // Overriding method to calculate perimeter of the rectangle
    @Override
    public void calculatePerimeter() {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter + " cm");
    }

    // Overriding method to calculate area of the rectangle
    @Override
    public void calculateArea() {
        float area = length * breadth;
        System.out.println("Area: " + area + " cm");
    }
}

// Main class to test the implementation
public class InterfaceExample {

    public static void main(String[] args) {
        // Creating a Square object and displaying its details
        Square square = new Square(10.0f);
        square.display();
        square.calculatePerimeter();
        square.calculateArea();

        // Creating a Rectangle object and displaying its details
        Rectangle rectangle = new Rectangle(12.0f, 15.0f);
        rectangle.display();
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
    }
}
