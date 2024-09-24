package stringhandling;
// Question :- Write a program to input any two string and combine them.

import java.util.Scanner;

public class StringConcatExample {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter any two Strings: ");
	     String s1 = sc.nextLine();
	     String s2 = sc.nextLine();
	     // Concatination
	     //String s3=s1.concat(s2);
	      String s3=s1+" "+s2;
	     System.out.println("The Strings are: "+s1+ " , " +s2);
	     System.out.println("Concatination of Two Strings: "+s3);

	}

}
