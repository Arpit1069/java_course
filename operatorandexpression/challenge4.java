package operatorandexpression;
// cuboid total surface area and much more 

import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
      float l,b,h;
      float vol,area;
      System.out.println("Enter the value of Length bredth height");
      Scanner sc = new Scanner(System.in);
      l = sc.nextFloat();
      b  = sc.nextFloat();
      h = sc.nextFloat();
        area = 2f*(l*b+b*h+h*l);
        vol = l*b*h;
        System.out.println("Total area is "+ area);
        System.out.println("Volume of cubiod is "+ vol);
    }
}
