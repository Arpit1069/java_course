package practice;
import java.util.*;
public class _16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine(); 

        HashMap <String,Integer> mapp = new HashMap<>();
        String words[]= str.split(" ");
         for(String word : words){
            mapp.put(word,mapp.getOrDefault(word, 0)+1);
         }
         System.out.println(mapp);


    }

}
