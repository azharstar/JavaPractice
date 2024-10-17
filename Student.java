package variables;

public class Student {
	int a=10;			//instance variable
	static int b=20;	//static variable
	void show() {
		int c=30;
		System.out.println(c);
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c); errror due to accessing local variable 'c'
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		s.show();
	}
}
