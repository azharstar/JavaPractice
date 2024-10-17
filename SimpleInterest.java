package controlstatements;

import java.util.Scanner;

// Class to calculate Simple Interest
class Interest {
    double principal, rate,  simple_interest;
    int time;
    // Constructor to initialize variables through keyboard
    Interest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();
        System.out.println("Enter rate of Interest: ");
        rate = sc.nextDouble();
        System.out.println("Enter time in years: ");
        time = sc.nextInt();
    }
    // Method to display user input
    public void display() {
    	System.out.println("---------------------------------------");
    	System.out.println("Principal Amount: "+principal);
    	System.out.println("Rate of Interest: "+rate);
    	System.out.println("Time (in years): "+time);
    	System.out.println("---------------------------------------");
    }

    // Method to calculate simple interest
    public void calculateSimpleInterest() {
        simple_interest = ((principal * rate * time) / 100);
        System.out.println("Simple Interest: " + simple_interest);
    }
}

// Initial Class for  Simple Interest calculation
public class SimpleInterest {

    public static void main(String[] args) {
        Interest i = new Interest();
        i.display();
        i.calculateSimpleInterest();
    }
}
