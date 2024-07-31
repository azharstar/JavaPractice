package methods;

import java.util.Scanner;

public class Rectangle {
	public static int calculateArea(int len, int breadth)
	{
		// calculating area of a Rectangle
		return len * breadth;
	}
	public static int calculatePerimeter(int len, int breadth)
	{
		// calculating perimeter of a Rectangle
		return 2*(len + breadth);
	}
	public static void main(String[] args) {
		// creating object of Scanner Class
		Scanner sc = new Scanner(System.in);
		// taking input from keyboard
		System.out.print("Enter Length and Width of Rectangle: ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		// calling method calculateArea and storing in Area
		int area = calculateArea(length, breadth);
		// calling method calculatePerimeter and storing in perimeter
		int perimeter = calculatePerimeter(length, breadth);
		System.out.println("--------------------------------");
		// Printing Area and Perimeter
		System.out.println("Area of Rectangle: "+area);
		System.out.println("Perimeter of Rectangle: "+perimeter);
	}
}
