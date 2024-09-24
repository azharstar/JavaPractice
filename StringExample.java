package stringhandling;

public class StringExample {

	public static void main(String[] args) {
	String s1="Hello";	//Creating by String Literal
	String s2="Hello";	
	String s3=new String("sHello");  //Creating by String by 'new' Keyword
	// Reference will be same for the same ("Hello")values
	System.out.println("Reference of s1: "+s1.hashCode());
	System.out.println("Reference of s2: "+s2.hashCode());
	System.out.println("Reference of s3: "+s3.hashCode());
	}

}
