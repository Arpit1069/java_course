package lab;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(String course) {
        courses.add(course);
    }
    
    public void removeCourse(String course) {
        courses.remove(course);
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}

public class _21student {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student("John Doe", 10);
        
        // Add courses
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");
        
        // Display student information
        student.display();
        
        // Remove a course
        student.removeCourse("Science");
        
        // Display updated student information
        student.display();
    }
}
