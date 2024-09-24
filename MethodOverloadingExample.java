package polymorphism;

// Class to calculate the volume of different shapes
class VolumeCalculator {
    // Method to calculate the volume of a cube
    public void calculateVolume(int side) {
        // Volume of a cube = side^3
        float volume = side * side * side;
        System.out.println("---CUBE---");
        System.out.println("Side: " + side + " cm");
        System.out.println("Volume: " + volume + " cubic cm");
    }

    // Method to calculate the volume of a sphere
    public void calculateVolume(float radius) {
        // Volume of a sphere = (4/3) * π * radius^3
        float volume = (4 * 3.14f * radius * radius * radius) / 3;
        System.out.println("---SPHERE---");
        System.out.println("Radius: " + radius + " cm");
        System.out.println("Volume: " + volume + " cubic cm");
    }

    // Method to calculate the volume of a cuboid
    public void calculateVolume(int length, int width, int height) {
        // Volume of a cuboid = length * width * height
        float volume = length * width * height;
        System.out.println("---CUBOID---");
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Volume: " + volume + " cubic cm");
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        // Creating an instance of VolumeCalculator
        VolumeCalculator vc = new VolumeCalculator();
        
        // Calculating the volume of a sphere with radius 7.0 cm
        vc.calculateVolume(7.0f);
        
        // Calculating the volume of a cube with side 10 cm
        vc.calculateVolume(10);
        
        // Calculating the volume of a cuboid with length 10 cm, width 20 cm, and height 30 cm
        vc.calculateVolume(10, 20, 30);
    }
}
