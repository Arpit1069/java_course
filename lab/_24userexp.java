package lab;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student3 {
    private int rollNo;
    private String name;
    private int age;
    private String course;
    
    public Student3(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name should only contain alphabets and spaces.");
        }
        
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class _24userexp {
    public static void main(String[] args) {
        try {
            Student3 student1 = new Student3(1, "John Doe", 18, "Computer Science");
            student1.display();
            
            System.out.println();
            
            Student3 student2 = new Student3(2, "Jane3Smith", 16, "Mathematics");
            student2.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
