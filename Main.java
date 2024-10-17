package datatypes;
public class Main {
	public static void main(String[] args) {
//		1st step is create the object of the class
		Animal dog = new Animal();
//		2nd step --> call the method and properties
		dog.name="Regun";
		dog.color="Black";
		dog.length=2;
		dog.sound();
		dog.run();
		System.out.println(dog.name);
		System.out.println(dog.color);
		System.out.println("------------------------");
		Animal cat = new Animal();
		cat.name="Kitty";
		cat.color="White";
		cat.length=1;
		cat.sound();
		cat.run();
		System.out.println(cat.name);
		System.out.println(cat.color);
	}
}
