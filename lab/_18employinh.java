package lab;
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;
    
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    private String designation;
    private double salary;
    
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }
    
    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
    
    public boolean hasSalaryGreaterThan5000() {
        return salary > 5000;
    }
}

public class _18employinh {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].accept();
        }
        
        System.out.println("Employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.hasSalaryGreaterThan5000()) {
                employee.display();
                System.out.println();
            }
        }
    }
}
