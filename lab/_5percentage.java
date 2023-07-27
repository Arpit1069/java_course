package lab;
import java.lang.*;

abstract class Marks {
    public abstract float getPercentage();
}

class A extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;
    
    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    
    public float getPercentage() {
        int totalMarks = subject1 + subject2 + subject3;
        return (float) totalMarks / 3;
    }
}

class B extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    
    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    
    public float getPercentage() {
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        return (float) totalMarks / 4;
    }
}

public class _5percentage {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 92);
        B studentB = new B(78, 86, 89, 95);
        
        float percentageA = studentA.getPercentage();
        float percentageB = studentB.getPercentage();
        
        System.out.println("Percentage of Student A: " + percentageA + "%");
        System.out.println("Percentage of Student B: " + percentageB + "%");
    }
}
