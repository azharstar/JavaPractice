package datatypes;

public class TypeCast {
	public static void main(String[] args) {
		byte b=10;
		int i=b; //Implicit Type Casting(Widening)
		System.out.println(b);
		System.out.println(i);
		
		int a=20;
		byte bb=(byte) a; //Explicit Type Casting 
		System.out.println(a);
		System.out.println(bb);
	}
}
