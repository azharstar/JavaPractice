package inheritance;

import java.util.Scanner;

class Number
{
	int num1,num2;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
	public void display() {
		System.out.println("--------------------------------------------");
		System.out.println("The Entered Numbers are: "+num1+" and "+num2);
	}
}

public class NumericCalculation extends Number {
	public void calculateSum() {
		System.out.println("Sum of "+num1+" and "+num2+" is "+(num1+num2));
	}
	public void calculateDifference() {
		System.out.println("Difference of "+num1+" and "+num2+" is "+(num1-num2));
	}
	public static void main(String[] args) {
		NumericCalculation n=new NumericCalculation();
		n.input();
		n.display();
		n.calculateSum();
		n.calculateDifference();
	}
}
