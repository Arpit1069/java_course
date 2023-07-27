package practice;

import java.util.Scanner;

class p1{
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    public void acc() {
        System.out.println("nam:");
        name = sc.nextLine();
        System.out.println("saal:");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class e1 extends p1{
    String des;
    int sal;
    public void acc(){
        super.acc();
        System.out.println("des:");
        des = sc.nextLine();
        System.out.println("sal:");
        sal = sc.nextInt();

    }
    public void display(){
        super.display();
        System.out.println("des: " + des);
        System.out.println("sal: " + sal);
    }

    public boolean higher(){
        return sal>5000;

    }
}
public class _18 {
    
    
}
