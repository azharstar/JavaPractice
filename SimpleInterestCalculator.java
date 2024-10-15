package exceptionhandling;

import java.util.Scanner;

class SimpleInterest{
	float principal;
    float rate;
    int time;
    
    // Constructor to initialize Interest object with user input
    public SimpleInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal in Rs: ");
        principal = sc.nextFloat();
        System.out.println("Enter rate(in %): ");
        rate = sc.nextFloat();
        System.out.println("Enter time(in year): ");
        time = sc.nextInt();
        System.out.println("-------------------------------");
        sc.close();
    }
 // Method to display information
    private void displayInfo() {
        System.out.println("Principal : Rs " + principal);
        System.out.println("Rate : " + rate + "%");
        System.out.println("Time : " + time + " in years");
    }
    // Method to calculate simple interest and handle exceptions
    public void calculateSimpleInterest() throws PrincipalException,RateException,TimeException {
            if (principal < 0) {
                throw new PrincipalException(" Exception : Principal cannot be Negative");
            } 
            else if (rate < 0) {
                throw new RateException("Exception : Rate cannot be Negative");
            } 
            else if (time < 0) {
                throw new TimeException("Exception : Time cannot be Negative");
            } 
            else {
                float si = (principal * rate * time) / 100;
                displayInfo();
                System.out.println("Simple Interest: " + si);
            }
}
    
// Initial Class
public class SimpleInterestCalculator {

	public static void main(String[] args) {
		SimpleInterest interest = new SimpleInterest();
		try {
			interest.calculateSimpleInterest();
		}
		catch (PrincipalException | RateException | TimeException e) {
            System.err.println(e.getMessage());
        }
	}
}
}

