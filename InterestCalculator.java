package exceptionhandling;
import java.util.Scanner;

// Custom Exception class for invalid Principal input
class PrincipalException extends Exception{
    public PrincipalException(String msg) {
        super(msg);
    }
}

// Custom Exception class for invalid Rate input
class RateException extends Exception{
    public RateException(String msg) {
        super(msg);
    }
}

// Custom Exception class for invalid Time input
class TimeException extends Exception{
    public TimeException(String msg) {
        super(msg);
    }
}

class Interest{
    float principal;
    float rate;
    int time;
    
    // Constructor to initialize Interest object with user input
    public Interest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal in time: ");
        principal = sc.nextFloat();
        System.out.println("Enter rate(in %): ");
        rate = sc.nextFloat();
        System.out.println("Enter time(in year): ");
        time = sc.nextInt();
        System.out.println("-------------------------------");
    }
    
    // Method to display information
    private void displayInfo() {
        System.out.println("Principal : Rs " + principal);
        System.out.println("Rate : " + rate + "%");
        System.out.println("Time : " + time + " in years");
    }
    
    // Method to calculate simple interest and handle exceptions
    public void calculateSimpleInterest() {
        try {
            if (principal < 0) {
                throw new PrincipalException("Principal cannot be Negative");
            } else if (rate < 0) {
                throw new RateException("Rate cannot be Negative");
            } else if (time < 0) {
                throw new TimeException("Time cannot be Negative");
            } else {
                float si = (principal * rate * time) / 100;
                displayInfo();
                System.out.println("Simple Interest: " + si);
            }
        } catch (PrincipalException | RateException | TimeException e) {
            System.err.println(e.getMessage());
        }
    }
}

public class InterestCalculator {
    public static void main(String[] args) {
        // Creating an instance of Interest to calculate simple interest
        Interest si = new Interest();
        si.calculateSimpleInterest();
    }
}
