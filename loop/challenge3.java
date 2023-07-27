package loop;

import java.util.Scanner;

public class challenge3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = scan.nextInt();
        int i=0 ;
        int m = n;
        int sum = 0;
        int r;
        while (n > 0) {
            r = n % 10;
            n = n / 10; 
            i = i * 10;
            i = r + i;
            
        }
        System.out.println("Reverse of given number is: "+i);

        if(i==m){
            System.out.println("the given number is palindrome");
        }
        else{
            System.out.println("the given number is not palindrome");
        }
    }
}
