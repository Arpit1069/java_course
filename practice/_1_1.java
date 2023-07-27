package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _1_1 {

    public static void main(String[] args) {
     int ar[]= new int[7];  
     Scanner sc = new Scanner(System.in);
     for(int i=0;i<7;i++){
        System.out.println("enter the "+i +"element = ");
        ar[i] = sc.nextInt();
     }
     System.out.println("array:");
      for(int i=0;i<7;i++){
        System.out.print(ar[i]+" ");
     }
     int result[] = removeDuplicate(ar);
     System.out.println(result[0]);
     System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    
    }
    public static int[] removeDuplicate(int[] array){
        HashSet <Integer> unique = new HashSet<Integer>();
        for(int element : array){
            unique.add(element);
        }
        int result[] = new int [unique.size()];
        int index =0;
        for(int element : unique)
        {
            result[index] = element;
            index++;
        }
        return result;
    }

}

