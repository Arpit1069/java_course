package operatorandexpression;
// roots of a quadratic equation

import java.util.Scanner;

public class challenge3 {
    public static void main(String[] args) {
        float a,b,c;
        double root1,root2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient of equation");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        System.out.println("equation is"+a+"x^2 +"+b+"x + "+c);
        root1 = (-b + (Math.sqrt((b*b) - (4f*a*c))))/2f*a;
        root2 = (-b - (Math.sqrt((b*b) - (4f*a*c))))/2f*a;
        System.out.println("roots are "+ root1 +" "+ root2);
    }
}
