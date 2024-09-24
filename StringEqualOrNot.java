package stringhandling;
// write a program to input two string and check both are equal or not?
import java.util.Scanner;

public class StringEqualOrNot {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter any two Strings: ");
	     String s1 = sc.nextLine();
	     String s2 = sc.nextLine();
	     // Comparing
	     if (s1.equals(s2))
	    	 System.out.println(("Both Strings are Equal"));
	     else
	    	 System.out.println(("Both Strings are Not Equal"));
	}

}

