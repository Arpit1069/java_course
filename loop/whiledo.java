package loop;

public class whiledo {
    public static void main(String[] args) {
        int i = 1;// 100
        while (i < 100) {
            System.out.println(i);
            i = i * 2;
        }

        do {
            System.out.println(i);
            i = i * 2;
        } while (i < 100);
    }
}
