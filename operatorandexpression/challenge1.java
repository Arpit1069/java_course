package operatorandexpression;
// Area of triangle
import java.io.InputStream;
import java.lang.*;
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        float base, height, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base and height ");
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = (base * height) / 2;
        System.out.println("Area is " + area);
    }
}
