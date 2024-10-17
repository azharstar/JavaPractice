package controlstatements;

import java.util.Scanner;

public class Greatestof3 {

    public static void main(String[] args) {
        //  read three integer variables from the user
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.print("Enter 2st Number: ");
		int b=sc.nextInt();
		System.out.print("Enter 3st Number: ");
		int c=sc.nextInt();
        // Check if 'a' is greater than all other variables
        if (a > b && a > c) {
            System.out.println(a + " (a) is Greater");
        }
        // Check if 'b' is greater than all other variables
        else if (b > a && b > c ) {
            System.out.println(b + " (b) is Greater");
        }
        // Check if 'c' is greater than all other variables
        else if (c > a && c > b) {
            System.out.println(c + " (c) is Greater");
        }
        // Check if all are equal
        else if(a==b && b==c ) {
        	System.out.println("All Entered Numbers are equal"+a);
        }
    }
}
