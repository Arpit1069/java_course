package printandstring;

public class stringmethod3 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = "Java";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.compareTo(str3));

        String str4 = "python";
        String str5 = new String("python");
        System.out.println(str1.compareTo(str4));
        System.out.println(str4.equals(str5));
        System.out.println(str4 == str5);

    }
}
