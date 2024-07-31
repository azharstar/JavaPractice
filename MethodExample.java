package methods;

public class MethodExample {
	public static void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum of "+a+" and "+b+ " is: "+sum);
	}
	public static void main(String[] args) {
		addition(10,5);
		addition(11,75);
		addition(12,4);
		
	}
}
