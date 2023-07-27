package objectoriented;

import javax.xml.transform.Source;

class circle1{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2d*Math.PI*radius;
    }

}
public class circle {
    public static void main(String[] args) {
        circle1 c = new circle1();
        c.radius = 7;
        System.out.println(c.area());
        System.out.println(c.circumference());
        circle1 c1 = new circle1();
        c1.radius = 14;
        System.out.println(c1.area());
        System.out.println(c1.circumference());
    }
}
