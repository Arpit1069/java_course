package abstraction;

abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }

    public double perimeter(){
        return 2*3.14*radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
} 

class Rectangle extends Shape{
    int l;
     int b;
    Rectangle(int l, int b){
        this.l = l;
        this.l = b;
    }

    public double perimeter(){
        return 2*(l+b);
    }
    public double area(){
        return l*b;
    }
} 
public class stdChalenge1 {
  public static void main(String[] args) {
    Circle c = new Circle(5);
    System.out.println(c.perimeter());
  }
}
