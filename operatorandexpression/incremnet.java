package operatorandexpression;

public class incremnet {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int z1 = 2 * x++ + 3 * ++x;
        int z2 = 2 * x++ + 3 * ++y;
        System.out.println(z1);
        System.out.println(z2);
    }
}
