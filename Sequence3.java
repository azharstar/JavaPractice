package controlstatements;

import java.util.Scanner;

public class Sequence3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking input
		System.out.print("Enter a Number for Table: ");
		int num=sc.nextInt();
		System.out.println("20 Multiples of "+num);
		for(int i=1;i<=20;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			
		}
	}

}
