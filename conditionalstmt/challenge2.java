package conditionalstmt;

import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        str = sc.nextLine();
        if(str.matches("[0-1]+")){
            System.out.println("given string is a binary number");
        }
        else if(str.matches("[0-7]+")){
            System.out.println("given string is a octal number");
        }
        else if(str.matches("[0-9]+")){
            System.out.println("given string is a decimal number");
        }
        else if(str.matches("[0-9A-F]+")){
            System.out.println("given string is a hexadecimal number");
        }
        else{
            System.out.println("invalid number");
        }
    }
}
