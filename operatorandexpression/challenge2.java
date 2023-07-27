package operatorandexpression;
// Area of triangle using area = sqrt(s(s-a)(s-b)(s-c))
import java.util.Scanner;
import java.lang.*;

public class challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side1 , side2, side3;
        float s;
        double area;
        System.out.println("Enter the sides ");
        side1 = sc.nextFloat();
        side2 = sc.nextFloat();
        side3 = sc.nextFloat();
        s = (side1 + side2 + side3)/2f;
        area = Math.sqrt(s*(s-side1)*(s- side2)*(s -side3));
        System.out.println("area is "+ area);
    }
}
