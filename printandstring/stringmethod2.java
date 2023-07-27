package printandstring;

public class stringmethod2 {

    public static void main(String[] args) {
        String str = "www.linkenIn.com";
        boolean start = str.startsWith("www");
        System.out.println(start);

        boolean end = str.endsWith("org");
        System.out.println(end);

        char ch = str.charAt(5);
        System.out.println(ch);

        int i1 = str.indexOf("link");
        int i2 = str.indexOf(".", 6);
        int i3 = str.indexOf("?");
        int i4 = str.lastIndexOf(".");
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
    }
}
