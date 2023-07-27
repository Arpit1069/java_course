package practice;

import java.util.Scanner;

public class _2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int count =0;
        for(int i=0; i<words.length;i++){
            for(int j=i+1; j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[i] = "0";
                    
                }
            }
        }
        System.out.println(count);
    }
    
}
