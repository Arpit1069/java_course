package printandstring;

public class string {
    public static void main(String[] args) {
        String str1 = "Java program";
        System.out.println(str1);

        String str2 = new String("java");
        System.out.println(str2);

        char c[] = { 'A', 'B', 'C', 'D' };
        String str3 = new String(c,0,3);
        System.out.println(str3);

        byte b[] = { 65, 66, 67, 68 };
        String str4 = new String(b,2,2);
        System.out.println(str4);

    }
}
