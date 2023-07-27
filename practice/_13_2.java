package practice;

import java.util.*;
import java.io.*;

public class _13_2 {
    public static void main(String[] args) {
        try{
            File file = new File("lab/Text.txt");
            Scanner sc = new Scanner(file);
            int count =0;
            while(sc.hasNext()){
                sc.next();
                count++;
            }
            System.out.println("number of words in file "+ count);
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    

}
