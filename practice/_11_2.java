package practice;

import java.util.Scanner;

public class _11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num>2){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println("not prime");
                }
                
             }
        }
         else{
            System.out.println("prime");
        }
    }
}
