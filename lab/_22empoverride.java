package lab;
class Person2 {
    private String firstName;
    private String lastName;
    
    public Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
}

class Employee2 extends Person2 {
    private int employeeId;
    private String jobTitle;
    
    public Employee2(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class _22empoverride {
    public static void main(String[] args) {
        Person2 person = new Person2("John", "Doe");
        Employee2 employee = new Employee2("Jane", "Smith", 123456, "Manager");
        
        System.out.println("Person Details:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        
        System.out.println("\nEmployee Details:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
