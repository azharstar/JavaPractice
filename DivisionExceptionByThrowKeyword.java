package exceptionhandling;

import java.util.Scanner;

public class DivisionExceptionByThrowKeyword {

	public static void main(String[] args) {
		int num1,num2;
		// Object of Scanner class
		Scanner sc = new Scanner(System.in);
		// input of data through keyboard
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		try {
				if (num2 == 0) {
					throw new ArithmeticException("Error");
				}
				else {
					System.out.println("On Dividing "+num1+" by "+num2+" : ");
					System.out.println("Quotient: "+(num1/num2));
					System.out.println("Remainder: "+(num1%num2));
				}
		}
		catch(ArithmeticException e) {
			System.out.println("Unable to divide a number by Zero: "+e);
		}

	}

}
