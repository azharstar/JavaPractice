package methods;

import java.util.Scanner;

public class AverageCalculator {
	// method to calculate simple interest
	public static float calculateSimpleInterest(float principal,float rate,int time)
	{
		float si;
		// calculating simple interest
		si=(principal * rate * time)/100;
		// returning simple interest
		return si;
	}
	public static void main(String[] args) {
		// Creating object for Scanner Class
		Scanner sc = new Scanner(System.in);
		// variables to store principal, rate and time;
		float principal, rate;
		int time;
		// input from keyboard
		System.out.print("Enter Principal(in Rs): ");
		principal = sc.nextFloat();
		System.out.print("Enter Rate(in %): ");
		rate = sc.nextFloat();
		System.out.print("Enter Time(in years): ");
		time = sc.nextInt();
		// calculate simple interest
		float interest = calculateSimpleInterest(principal, rate, time);
		// to calculate amount
		float amount = principal + interest;
		System.out.println("-----------------------------------------------------");
		System.out.println("Amount to be paid after charging simple interest: Rs "+amount);
	}
}
