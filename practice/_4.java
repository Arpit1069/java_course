package practice;

abstract class vehicle1{
    public abstract void move1();
}
class Helicopter1 extends vehicle1{
    @Override
    public  void move1(){
        System.out.println("Helicopter flies");
    }
 }
 class car1 extends vehicle1{
    @Override
    public  void move1(){
        System.out.println("car dancing");
    }
 }
public class _4 {
    public static void main(String[] args) {
        vehicle1 veh = new car1();
        veh.move1();
        vehicle1 ve = new Helicopter1();
        ve.move1();
    }
    
}
