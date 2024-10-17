package datatypes;

public class Student {
//		Initializing Student details
	int s_id;
	String s_name;
	long p_no;
//		creating a method called "fun"
	void fun() {
		System.out.println("Student is having fun :)");
	}
	public static void main(String[] args) {
//		creating object for class
		Student std =new Student();
//		Assigning values
		std.s_name="Shiva";
		std.s_id=89;
		std.p_no=999888;
//		calling the initialized elements
		System.out.println(std.s_id);
		System.out.println(std.s_name);
		System.out.println(std.p_no);
//		calling the method
		std.fun();
	}
}

