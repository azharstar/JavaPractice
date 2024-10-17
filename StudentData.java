package encapsulation;

public class StudentData {
	public static void main(String[] args) {
		// Student Object creation
		Student student1 = new Student();
		// Setting the data
		student1.setStudentId("AF0409190");
		student1.setStudentName("Azhar");
		student1.setStandard("Post Graduation");
		student1.setRollNumber(91);
		student1.setAge(21);
		// Displaying Student data
		System.out.println("Student Details: ");
		System.out.println("Id : "+student1.getStudentId());
		System.out.println("Name: "+student1.getStudentName());
		System.out.println("Standard: "+student1.getStandard());
		System.out.println("Roll Number: "+student1.getRollNumber());
		System.out.println("Age: "+student1.getAge());
	
	}

}
