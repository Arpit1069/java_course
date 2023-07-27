package objectoriented;

class Rectangle1 {

    public double length;
    public double breadth;

    public Rectangle1() {
        length = 1;
        breadth = 1;
    }

    public Rectangle1(double l, double b) {
        length = l;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth)
            return true;
        else
            return false;
    }
}

public class constructor {
public static void main(String args[]) {
    Rectangle1 r1 = new Rectangle1(10, 5);
    Rectangle1 r2 = new Rectangle1();
    System.out.println(r1.area());
    System.out.println(r2.area());
}
}
