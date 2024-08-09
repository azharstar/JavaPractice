package inheritance;

import java.util.Scanner;

// Base Class
class Car {
    String engineType;
    double fuelCapacity;

    // Method to input car details
    public void inputCarDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Engine Type of Car: ");
        engineType = sc.nextLine();
        System.out.println("Enter the Fuel Capacity of Car: ");
        fuelCapacity = sc.nextDouble();
    }

    // Method to display car details
    public void displayCar() {
        System.out.println("This is a Car");
        System.out.println("The Engine Type of Car: " + engineType);
        System.out.println("Fuel Capacity: " + fuelCapacity);
    }
}

// Derived Class
class Mahindra extends Car {
    String model;
    int year;
    String color;
    double price;

    // Method to input Mahindra car details
    public void inputMahindraDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Model of Mahindra Car: ");
        model = sc.nextLine();
        System.out.println("Enter the Launch Year: ");
        year = sc.nextInt();
        System.out.println("Enter the color of Mahindra Car: ");
        color = sc.nextLine();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter the Price: ");
        price = sc.nextDouble();
    }

    // Method in the derived class to display Mahindra car information
    public void displayMahindra() {
        System.out.println("This is a Mahindra Car");
        System.out.println("Model: " + model);
        System.out.println("Launch Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the derived class Mahindra
        Mahindra m_car = new Mahindra();
        
        // Input and display details of the base class Car
        m_car.inputCarDetails();
        m_car.displayCar();
        
        // Input and display details of the derived class Mahindra
        m_car.inputMahindraDetails();
        m_car.displayMahindra();
    }
}
