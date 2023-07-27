package method;

public class recusion {
    static void recursion1(int x) {
        if (x > 0) {
            System.out.print(x);
            recursion1(x - 1);
        }
    }

    static void recursion2(int x) {
        if (x > 0) {
            recursion2(x - 1);
            System.out.print(x);
        }

    }

    public static void main(String[] args) {
        int x = 5;
        recursion1(x);
        recursion2(x);
    }
}
