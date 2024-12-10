/* Write a Java program to demonstrate multilevel inheritance.
For example, create a class Animal, extend it into Mammal, and then further into Dog. 
Show how methods are inherited across multiple levels. */

package firstproject;

//creating base class Animal
class Animal {
	public void eat() {
		System.out.println("This animal eats food...");
	}
}

//Extending base class
class Mammal extends Animal {
	public void swim() {
		System.out.println("This animal can Swim...");
	}
}

//Extending the derived class(Mammal) which is derived from the base class(Animal)
class Dog extends Mammal {
	public void bark() {
		System.out.println("This animal can Bark...");
	}
}

public class MultiLevelInheritanceExample {

	public static void main(String[] args) {
		// Creating object for the base class(Dog)
		Dog animal = new Dog();
		animal.eat();		
		animal.swim();	
		animal.bark();		

	}

}

