package operatorandexpression;

public class bitwise {
    public static void main(String[] args) {
        int x = 8;
        int y = x >> 1, z = x << 1;
        System.out.println(y + " " + z);
        int e = -10;
        int v = e >>> 1;
        int u = e >> 1;
        System.out.println(v + " " + u);
        int a = -0b1010;
        System.out.println(a);
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        int b = a >> 1;
        System.out.println(Integer.toBinaryString(b));
    }
}
