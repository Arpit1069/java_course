package practice;

import java.util.Scanner;

public class _11_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        for(int i =1 ;i<=10;i++){
            int table = i*num;
            System.out.println(num + "*" + i + "=" + table  );
        }
    }
}