package exceptionhandling;

import java.util.Scanner;

//Custom Exception class 
class CompoundException extends Exception{
 public CompoundException(String msg) {
     super(msg);
 	}
}
class CompoundInterest{
	float principal;
    float rate;
    int time;
    int n;
    public CompoundInterest() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter principal amount: ");
        principal = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
        rate = sc.nextFloat();

        System.out.print("Enter time period (in years): ");
        time = sc.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        n =  sc.nextInt();
        sc.close();
	}
    private void displayInfo() {
        System.out.println("Principal : Rs " + principal);
        System.out.println("Rate : " + rate + "%");
        System.out.println("Time : " + time + " in years");
        System.out.println("Number of times interest is compounded per year: "+n);
    }
    public void calculateCompoundInterest() throws PrincipalException,RateException,TimeException,CompoundException {
    	 if (principal < 0) {
             throw new PrincipalException(" Exception : Principal cannot be Negative");
         } 
         else if (rate < 0) {
             throw new RateException("Exception : Rate cannot be Negative");
         } 
         else if (time < 0) {
             throw new TimeException("Exception : Time cannot be Negative");
         } 
         else if (n < 0) {
        	 throw new CompoundException("Exception : Compounded Number cannot be Negative");
         }
         else {
        	 double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time );
        	 displayInfo();
        	 System.out.println("Compound Interest: "+(amount - principal));
        	 
         }
    }
}
// Initial Class
public class CompoundInterestCalculator {

	public static void main(String[] args) {
		CompoundInterest interest = new CompoundInterest();
		try {
			interest.calculateCompoundInterest();
		}
		catch (PrincipalException | RateException | TimeException | CompoundException e) {
            System.err.println(e.getMessage());
        }


	}

}
