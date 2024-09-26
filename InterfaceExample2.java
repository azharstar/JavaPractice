package abstraction_interface;

// Define the interface
interface ThreeDFigure {
	float pi = 3.14f;
    // Method to calculate the curved surface area
    void calculateCurvedSurfaceArea();
    // Method to calculate the total surface area
    void calculateTotalSurfaceArea();
    // Method to calculate the volume
    void calculateVolume();
}

// Implement the interface in the Cylinder class
class Cylinder implements ThreeDFigure {
    float radius;
    float height;

    // Constructor to initialize the radius and height of the cylinder
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to display the details of the cylinder
    public void display() {
        System.out.println("Cylinder");
        System.out.println("Radius : " + radius + " cm");
        System.out.println("Height: " + height + " cm");
    }

    // Implement the method to calculate the curved surface area
    @Override
    public void calculateCurvedSurfaceArea() {
        float curvedSurfaceArea = 2 * ThreeDFigure.pi * radius * height;
        System.out.println("Curved Surface Area: " + curvedSurfaceArea + " cm square");
    }

    // Implement the method to calculate the total surface area
    @Override
    public void calculateTotalSurfaceArea() {
        float totalSurfaceArea = 2 * ThreeDFigure.pi * radius * (radius + height);
        System.out.println("Total Surface Area: " + totalSurfaceArea + " cm square");
    }

    // Implement the method to calculate the volume
    @Override
    public void calculateVolume() {
        float volume = ThreeDFigure.pi * radius * radius * height;
        System.out.println("Volume: " + volume + " cm cube");
    }
}

// Main class to test the implementation
public class InterfaceExample2 {

    public static void main(String[] args) {
        // Create a Cylinder object 
        Cylinder cylinder = new Cylinder(3.0f, 10.0f);
        // Display the details of the cylinder
        cylinder.display();
        // Calculate and display the curved surface area
        cylinder.calculateCurvedSurfaceArea();
        // Calculate and display the total surface area
        cylinder.calculateTotalSurfaceArea();
        // Calculate and display the volume
        cylinder.calculateVolume();
    }
}
