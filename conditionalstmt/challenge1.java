package conditionalstmt;

import java.util.Scanner;


public class challenge1 {
    public static void main(String[] args) {
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        grade = sc.nextInt();
        System.out.println("marks: "+ grade);
        if(grade>90 && 100>grade){
            System.out.println("A");
        }
        else if(grade>80 && 90>grade){
            System.out.println("B");
        }
        else if(grade>70 && 80>grade){
            System.out.println("C+");
        }
        else if(grade>60 && 70>grade){
            System.out.println("D");
        }
        else if(grade>50 && 60>grade){
            System.out.println("E");
        }
        else if(grade>40 && 50>grade){
            System.out.println("F");
        }
        else {
            System.out.println("FAIL");
        }
    }
   
}
