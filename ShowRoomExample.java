package methods;

import java.util.Scanner;

class ShowRoom {
    // Instance variables
    String name; // to store the name of the customer
    long mobno; // to store the mobile number of the customer
    double cost; // to store the cost of the items purchased
    double dis; // to store the discount amount
    double amount; // to store the amount to be paid after discount

    // Default constructor
    ShowRoom() {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    // Method to input customer details
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = sc.nextLine();
        System.out.print("Enter mobile number: ");
        mobno = sc.nextLong();
        System.out.print("Enter cost of items purchased: ");
        cost = sc.nextDouble();
    }

    // Method to calculate discount
    void calculate() {
        // Determine discount based on cost
        if (cost <= 10000) {
            dis = 5; // 5% discount for cost <= 10000
        } else if (cost <= 20000) {
            dis = 10; // 10% discount for cost > 10000 and <= 20000
        } else if (cost <= 35000) {
            dis = 15; // 15% discount for cost > 20000 and <= 35000
        } else {
            dis = 20; // 20% discount for cost > 35000
        }
        // Calculate the amount to be paid after discount
        amount = cost - (cost * dis / 100);
    }

    // Method to display customer details and amount to be paid
    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Amount to be paid after discount: " + amount);
    }
}

public class ShowRoomExample {
    // Main method to create an object and call member methods
    public static void main(String[] args) {
        ShowRoom sr = new ShowRoom(); // Create an object of ShowRoom
        sr.input(); // Call input method to take customer details
        sr.calculate(); // Call calculate method to compute discount and amount
        sr.display(); // Call display method to show the details and final amount
    }
}
