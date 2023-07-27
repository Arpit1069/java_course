package method;

import printandstring.string;

public class variablearg {
    void show(int... x) {
        for (int a : x) {
            System.out.println(a);
        }
    }

    void showlist(int start, String... S) {
        for (int i = 0; i < S.length; i++) {
            System.out.println(start+"."+S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        int x[] = { 10, 20, 30, 40 };
        variablearg ar = new variablearg();
        ar.show(x);
        ar.showlist(5, new String[]{"arpit","arp","hello"});
    }
}
