package inheritance;

// Person class
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Employee class inheriting from Person
class Employee extends Person {
    String employeeId;

    // Parameterized constructor
    Employee(String name, int age, String employeeId) {
        super(name, age); // Call the constructor of the superclass (Person)
        this.employeeId = employeeId;
    }
}

// Main class to demonstrate the usage of Person and Employee classes
public class ExamplePerson {

    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp = new Employee("Md Azhar", 21, "E12345");

        // Print the details of the employee
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Employee ID: " + emp.employeeId);
    }
}
