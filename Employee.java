package encapsulation;

public class Employee {
    // Private fields to ensure encapsulation
    private String empId;
    private String empName;
    private String designation;
    private int age;
    private float salary;

    // Getter method for empId
    public String getEmpId() {
        return empId;
    }

    // Setter method for empId
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    // Getter method for empName
    public String getEmpName() {
        return empName;
    }

    // Setter method for empName
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter method for designation
    public String getDesignation() {
        return designation;
    }

    // Setter method for designation
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for salary
    public float getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
