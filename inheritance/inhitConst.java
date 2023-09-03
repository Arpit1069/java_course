package inheritance;

public class inhitConst {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println();
        Child c = new Child();
        System.out.println();
        grandChild g = new grandChild();
        System.out.println();
        Parent p1 = new Parent(13);
         System.out.println();
         Child c1 = new Child(10,20);
    }
}

class Parent {
    public Parent() {
        System.out.println("Parent constructor");
    }
    Parent(int x){
        System.out.println("U are using parameter"+x);
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child constructor");
    }
    public Child(int x, int y){
        super(x);
        System.out.println("using 2 parameter"+y);
    }
}
class grandChild extends Child {
    public grandChild() {
        System.out.println("grandChild constructor");
    }
}