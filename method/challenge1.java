package method;

import java.util.Scanner;

public class challenge1 {
    static void prime(int x){
        for(int i =2;i<x;i++){
           if (x%i==0){
            System.out.println("not prime");
            break;
           } 
           else{
            System.out.println("prime");
            break;
           }
        }
    }
    static int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
    public static void main(String[] args) {
        
        System.out.println(gcd(35,56));
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the number: ");
        int x = sc.nextInt();
        prime(x);
        
    }
}
