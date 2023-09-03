package interfaces;

interface test{
    void meth1();
    void meth2();
}

class test2 implements test{
    public void meth1(){
        System.out.println("meth1");
    }

    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");

    }
}
public class interfaceex {
     public static void main(String[] args) {
        test t = new test2();
        t.meth1();
        t.meth2();
        test2 t1 = new test2();
        t1.meth1();
        t1.meth2();
        t1.meth3();
     }
}
