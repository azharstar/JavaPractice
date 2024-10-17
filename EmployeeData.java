package encapsulation;

public class EmployeeData {

	public static void main(String[] args) {
		//Employee Object creation
		Employee employee1 = new Employee();
		// Setting the data
		employee1.setEmpId("AF0409190");
		employee1.setEmpName("Azhar");
		employee1.setDesignation("Programmer");
		employee1.setAge(21);
		employee1.setSalary(3000000.0f);
		// Displaying Student data
		System.out.println("Employee Details: ");
		System.out.println("ID: "+employee1.getEmpId());
		System.out.println("Name: "+employee1.getEmpName());
		System.out.println("Designation: "+employee1.getDesignation());
		System.out.println("Age: "+employee1.getAge());
		System.out.println("Salary: "+employee1.getSalary());

	}

}
