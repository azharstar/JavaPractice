package inheritance;

// Base class Shape
class Shape {
    String color;
    boolean filled;

    // Parameterized constructor
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
}

// Subclass Circle inheriting from Shape
class Circle extends Shape {
    double radius;

    // Parameterized constructor
    Circle(String color, boolean filled, double radius) {
        super(color, filled); // Call the constructor of the superclass (Shape)
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle inheriting from Shape
class Rectangle extends Shape {
    double width;
    double height;

    // Parameterized constructor
    Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled); // Call the constructor of the superclass (Shape)
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    double getArea() {
        return width * height;
    }
}

// Main class to demonstrate the usage of Shape, Circle, and Rectangle classes
public class ExampleShape {

    public static void main(String[] args) {
        // Create an instance of Circle
        Circle myCircle = new Circle("Red", true, 5.0);
        // Print the details of the circle
        System.out.println("Circle - Color: " + myCircle.color + ", Filled: " + myCircle.filled + ", Area: " + myCircle.getArea());

        // Create an instance of Rectangle
        Rectangle myRectangle = new Rectangle("Blue", false, 4.0, 6.0);
        // Print the details of the rectangle
        System.out.println("Rectangle - Color: " + myRectangle.color + ", Filled: " + myRectangle.filled + ", Area: " + myRectangle.getArea());
    }
}
