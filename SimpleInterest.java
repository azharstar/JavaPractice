package controlstatements;

public class SimpleInterest {

    public static void main(String[] args) {
        // Declare and initialize the principal amount
        int principal = 10400;

        // Declare and initialize the rate of interest
        int rate = 3;

        // Declare and initialize the time period in years
        int time = 1; 

        // Calculate simple interest using the formula: (P * R * T) / 100
        int simple_interest = (principal * rate * time) / 100;

        // Print the calculated simple interest
        System.out.println("Simple Interest: " + simple_interest);
    }
}
