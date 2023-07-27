package practice;


import java.util.ArrayList;
import java.util.Arrays;


public class _1_2 {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] = {2,3,5,6}; 
        System.out.println("a :"+ Arrays.toString(a));
        System.out.println("b :"+ Arrays.toString(b));
        ArrayList <Integer> common = findcommon(a, b);
        System.out.println("Common elements: "+common);
    }
    
    public static ArrayList<Integer> findcommon(int[]a,int[]b){
        ArrayList <Integer> common = new ArrayList<Integer>();
        for(int element : a){
            if(contain(b,element)){
                common.add(element);
            }
        }
        return common;
    }
    public static boolean contain(int array[],int element){
        for(int value : array){
            if(value == element){
                return true;
            }
        }
        return false;
    }
}
