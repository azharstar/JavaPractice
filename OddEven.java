package scanner;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
//		Checks whether the given input Even or Odd
		if(num%2==0)
			System.out.println(num+" is Even");
		else
			System.out.println(num+" is Odd");
	}
}
