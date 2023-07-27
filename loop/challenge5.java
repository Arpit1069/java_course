package loop;

import java.util.Scanner;

public class challenge5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, n, term;
        System.out.println("Enter the no. of terms: ");
        n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a+" ");
        System.out.println(b+" ");
        while (i < n-2) { 
            term = a + b;
            a = b;
            b = term;
            System.out.println(term + " ");
            i++;
        }
    }
}
