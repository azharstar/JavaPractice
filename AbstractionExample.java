package abstraction_interface;

abstract class Bike {
	
	Bike() {
		System.out.println("Bike is a Two wheeler Vehicle");
	}
	
	// Abstract Method
	abstract void run();
}
// Derived Class
class PetrolBike extends Bike {
	
	//Defining Abstract method of abstract class 
	@Override
	public void run() {
		System.out.println("Petrol Bike needs petrol to run");
	}
}
// Initial Class
public class AbstractionExample {
	public static void main(String[] args) {
		PetrolBike unicorn = new PetrolBike();
		unicorn.run();
	}
}
