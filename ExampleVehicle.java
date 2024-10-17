package inheritance;
//Vehicle class
class Vehicle {
 String make;
 String model;

 // Parameterized constructor
 Vehicle(String make, String model) {
     this.make = make;
     this.model = model;
 }
}

//Car class inheriting from Vehicle
class Car extends Vehicle {
 int year;

 // Parameterized constructor
 Car(String make, String model, int year) {
     super(make, model); // Call the constructor of the superclass (Vehicle)
     this.year = year;
 }
}

//Main class to demonstrate the usage of Vehicle and Car classes
public class ExampleVehicle {

 public static void main(String[] args) {
     // Create an instance of Car
     Car myCar = new Car("Toyota", "Corolla", 2020);

     // Print the details of the car
     System.out.println("Make: " + myCar.make);
     System.out.println("Model: " + myCar.model);
     System.out.println("Year: " + myCar.year);
 }
}