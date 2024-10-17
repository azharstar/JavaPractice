// Swapping using 3 variables
package controlstatements;

public class Swap {
	int a=10;
	int b=20;
	int temp;
	void swapping(){
		temp=a;
		a=b;
		b=temp;
	}
	public static void main(String[] args) {
		Swap s=new Swap();
		System.out.println("a and b before swapping");
		System.out.println("a=" +s.a);	//10
		System.out.println("b=" +s.b);	//20
		s.swapping();
		System.out.println("a and b after swapping");
		System.out.println("a=" +s.a);	//20
		System.out.println("b=" +s.b);	//10
		
	}
}
