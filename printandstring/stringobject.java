package printandstring;

public class stringobject {
    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = "JAVA";
        String str3 = "jAVA";
        String str4 = new String("JAVA");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
