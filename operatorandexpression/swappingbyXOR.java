package operatorandexpression;

public class swappingbyXOR {
    public static void main(String[] args) {
        int x = 10, y = 12;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x +" "+ y);
    }
}
