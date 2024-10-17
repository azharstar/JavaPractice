package scanner;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
//		Create object of Scanner class
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter any Number: ");
		num=sc.nextInt();
//		To check natural number
		if(num > 0)
			System.out.println(num+ " is a natural number");
		else
			System.out.println(num+ " is not a natural number");
	}

}
