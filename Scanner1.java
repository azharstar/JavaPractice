package scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Roll Number:");
		int a=sc.nextInt();
		
		sc.nextLine(); //have to write when taking multiple String as Input
		
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Full Name:");
		String f_name=sc.nextLine();
		
		System.out.println("Roll No "+a);
		System.out.println("Name: "+name);
		System.out.println("Full Name: "+f_name);
	}

}
