package abstraction;

abstract class Super {

    public Super() {
        System.out.println("Super");
    }

    abstract void method1();

    public void method2() {
        System.out.println("Super method2");
    }
}

class Sub extends Super{
    @Override
    public void method1(){
        System.out.println("Sub method1");
    }
}
public class abstraction {

    public static void main(String[] args) {
            Super S1;
            Sub S2 = new Sub();
            S2.method1();
            S2.method2();
            

    }
}