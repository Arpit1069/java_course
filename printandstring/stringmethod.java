package printandstring;

public class stringmethod {
    public static void main(String[] args) {
        String str = new String("    Hello World   ");
        
        int l = str.length();
        System.out.println(l);

        String strl = str.toLowerCase();
        System.out.println(strl);

        String stru = str.toUpperCase();
        System.out.println(stru);

        str = str.trim();
        System.out.println(str);

        String strt = str.substring(6);
        System.out.println(strt);

        String strt1 = str.substring(6, 11);
        System.out.println(strt1);

        String strr = str.replace('o', 'a');
        System.out.println(strr);
    }

}
