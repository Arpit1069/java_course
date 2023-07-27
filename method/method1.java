package method;

public class method1{

    static int max (int x,int y){
        if (x>y){
            return x;
        }
        else{
            return y;
        }
    }

    int max1 (int x,int y){
        if (x>y){
            return x;
        }
        else{
            return y;
        }
    }
    static void inc(int x){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a = 10,b=3;
        int c = max(a,b);
        inc(a);
        System.out.println(a);
        System.out.println(c);
        method1 m1 = new method1();
        int d = m1.max1(b, a);
        System.out.println(d);
    }
}