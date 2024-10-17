package scanner;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
//		Creating object of Scanner Class
		Scanner sc = new Scanner(System.in);
		int num1,num2;
//		Input of data through keyboad
		System.out.print("Enter first number: ");
		num1=sc.nextInt();
		System.out.print("Enter second number");
		num2=sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("First No: "+num1);
		System.out.println("Secod No: "+num2);
//		Finding Sum when First No is less than Second No
		if(num1<num2)
			System.out.println("Addition : "+(num1+num2));
		System.out.println("-----------------------------");
	}

}
