package inheritance;
 public class circle1{
     public double  radius;
     public double area(){
        return 3.14*radius*radius;
     }
     public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.height=10;
        c1.radius = 7;
        System.out.println(c1.area());
        System.out.println(c1.volume());
     }
 }
 class cylinder extends circle1{
     public double  height;
     public double volume(){
        return area()*height;
     }
 }