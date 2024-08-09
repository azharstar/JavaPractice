package inheritance;

// Base Class
class Car {
    // Method in the base class to display car information
    public void displayCar() {
        System.out.println("This is a Car");
    }
}

// Derived Class
class Mahindra extends Car {
    // Method in the derived class to display Mahindra car information
    public void displayMahindra() {
        System.out.println("This is a Mahindra Car");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the derived class Mahindra
        Mahindra m_car = new Mahindra();
        
        // Calling the method from the base class using the derived class object
        m_car.displayCar();
        
        // Calling the method from the derived class
        m_car.displayMahindra();
    }
}
