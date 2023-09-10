package staticvsfinal;

import java.util.Date;

public class stdchallenge1 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        System.out.println(s.getroll());
        System.out.println(s1.getroll()); 
    }
}

class Student{
    private String roll;
    private static int count = 1;

    private String generateroll(){
        Date d = new Date();
        String rn = "UNIV-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }
    public Student(){
        roll = generateroll();
    }
public String getroll(){
    return roll;
}
}