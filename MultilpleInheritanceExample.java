package inheritance;
//Base class
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
		System.out.println("-----------------------");
	}
}

//Derived class
class Mammal extends Animal {
	void walk() {
		System.out.println("This mammal walks.");
		System.out.println("-----------------------");

	}
}

//Further derived class
class Dog extends Mammal {
	void bark() {
		System.out.println("The dog barks.");
		System.out.println("-----------------------");
	}
}

public class MultilpleInheritanceExample {
	public static void main(String[] args) {
	     Dog dog = new Dog();
	     dog.eat();  // From Animal
	     dog.walk(); // From Mammal
	     dog.bark(); // From Dog
}
}