package polymorphism;

//Write a program to calculate area of rectangle,triangle,square and circle

// Class to calculate the area of different shapes
class AreaCalculate {
    
    // Method to calculate the area of a rectangle
    public void calculateArea(int length, int width) {
        float area = length * width;
        System.out.println("---RECTANGLE---");
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Area: " + area + " sq cm");
    }

    // Method to calculate the area of a triangle
    public void calculateArea(float base, float height) {
        float area = 0.5f * base * height; // 0.5 = (1/2)
        System.out.println("---TRIANGLE---");
        System.out.println("Base: " + base + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Area: " + area + " sq cm");
    }

    // Method to calculate the area of a square
    public void calculateArea(int side) {
        float area = side * side;
        System.out.println("---SQUARE---");
        System.out.println("Side: " + side + " cm");
        System.out.println("Area: " + area + " sq cm");
    }

    // Method to calculate the area of a circle
    public void calculateArea(float radius) {
        float area = 3.14f * radius * radius;
        System.out.println("---CIRCLE---");
        System.out.println("Radius: " + radius + " cm");
        System.out.println("Area: " + area + " sq cm");
    }
}

public class MethodOverloadingExample2 {

    public static void main(String[] args) {
        AreaCalculate ac = new AreaCalculate();
        
        // Calculate and print the area of a rectangle
        ac.calculateArea(2, 3);
        
        // Calculate and print the area of a triangle
        ac.calculateArea(3.1f, 5.0f);
        
        // Calculate and print the area of a square
        ac.calculateArea(47);
        
        // Calculate and print the area of a circle
        ac.calculateArea(22f);
    }
}
